package com.raj.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
	 static Connection con;

	public Connection getConnection() {
		String url="jdbc:oracle:thin:@localhost:1521:orcl";
		String user="raj";
		String pwd="123";
		String className="oracle.jdbc.driver.OracleDriver";
		
		try {
			Class.forName(className);
			con=DriverManager.getConnection(url,user,pwd);
			
		}
		catch(SQLException | ClassNotFoundException e) {
			System.out.println(e);
		}
		return con;
		
	}

}
