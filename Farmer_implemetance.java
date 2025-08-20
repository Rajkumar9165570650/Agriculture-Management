package com.raj.implemetance;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.raj.bean.Farmer;
import com.raj.database.Database;
import com.raj.interfaces.farmer_interface;

public class Farmer_implemetance implements farmer_interface {
	Database d = new Database();

	@Override
	public boolean insert(Farmer farmer) {
		String query = "insert into Farmer values(?,?,?,?)";
		Connection con = d.getConnection();
		try {
			PreparedStatement pr = con.prepareStatement(query);
			pr.setString(1, farmer.getName());
			pr.setString(2, farmer.getPassword());
			pr.setString(3, farmer.getLocation());
			pr.setLong(4, farmer.getMobile());
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
	public boolean delete(String user,String password) {
		String query = "delete from Farmer where name=? and password=?";
		Connection con = d.getConnection();
		try {
			PreparedStatement pr = con.prepareStatement(query);
			pr.setString(1, user);
			pr.setString(2, password);
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
	public List<Farmer> view() {
		List<Farmer> list=new ArrayList<>();
		String query = "select * from farmer";
		Connection con = d.getConnection();
		try {
			PreparedStatement pr = con.prepareStatement(query);
			ResultSet rs = pr.executeQuery();
			while(rs.next()) {
				list.add(new Farmer(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4)));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
		
	}

	@Override
	public boolean valid(String user,String password) {
		
		String query = "select * from Farmer where name=? and password=?";
		Connection con = d.getConnection();
		try {
			PreparedStatement pr = con.prepareStatement(query);
			pr.setString(1, user);
			pr.setString(2, password);
			boolean aviable = pr.execute();
			
			if(aviable) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	

}
