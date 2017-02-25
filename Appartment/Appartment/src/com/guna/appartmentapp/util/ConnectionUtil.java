package com.guna.appartmentapp.util;
import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionUtil {

	public static Connection getConnection() throws Exception{
		
		
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/app_db";
		String user = "root";
		String password = "root";
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("connected to "+ url);
		return con;
	
	
}
}
