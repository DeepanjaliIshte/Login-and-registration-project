package com.company.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	private static final String URL="jdbc:mysql://localhost:3306/logreg" ;
	private static final String USERNAME="root";
	private static final String PASSWORD="Deepa07**..";
	
	static
	{
		try
		{
			// Load the MYSQL JDBC driver
			Class.forName("com:mysql.cj.jdbc.Driver");
		
		}
		catch (ClassNotFoundException e) 
		{
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	 public static Connection getConnection() throws SQLException 
	 	{
		 	System.out.println("Now connection build");
	        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
	    }
}
