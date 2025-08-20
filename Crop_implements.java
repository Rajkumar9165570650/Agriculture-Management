package com.raj.implemetance;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.raj.bean.Crop;
import com.raj.bean.Farmer;
import com.raj.database.Database;
import com.raj.interfaces.Crop_Interfaces;

public class Crop_implements implements Crop_Interfaces {
	 Database d = new Database();
	@Override
	public boolean insert(Crop crop) {
		String query = "insert into crop values(cropid.nextval,?,?,?)";
		Connection con = d.getConnection();
		try {
			PreparedStatement pr = con.prepareStatement(query);
			pr.setString(1, crop.getCropname());
			pr.setDouble(2, crop.getCropRate());
			pr.setString(3, crop.getCropSeason());
			int count = pr.executeUpdate();

			if(count>0) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean delete(int id) {
		String query = "delete from crop where cropid=?";
		Connection con = d.getConnection();
		try {
			PreparedStatement pr = con.prepareStatement(query);
			pr.setInt(1, id);
			int count = pr.executeUpdate();
			
			if(count>0) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
		
	}

	@Override
	public List<Crop> view() {
		List<Crop> list=new ArrayList<>();
		String query = "select * from crop";
		Connection con = d.getConnection();
		try {
			PreparedStatement pr = con.prepareStatement(query);
			ResultSet rs = pr.executeQuery();
			while(rs.next()) {
				list.add(new Crop(rs.getInt(1), rs.getString(2),  rs.getString(3), rs.getDouble(4)));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
		
	}

}
