package com.alpha.JDBCDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
/* 1.load--> forname("url") present in Class class -->exception ClassNotFound
 * 2.connection--> getConnection("jdbc:postgresql://localhost:5432/demo","postgres","root"); -->DriverManager class
 * exception SQL exception  ->
 * 
 */

public class LoadDriver {
  public static void main(String[] args) {
	try {
		Class.forName("org.postgresql.Driver");
		System.out.println("Driver Loaded");
		// url="jdbc:postgresql://localhost:5432/demo" user="postgres", password="root"
		
	Connection con=	DriverManager.getConnection("jdbc:postgresql://localhost:5432/demo?user=postgres&password=root");
		System.out.println("Connection Established");
		//DriverManager.getConnection("jdbc:postgresql://localhost:5432/demo","postgres","root"); -->2nd method.
		
		Statement stmt=   con.createStatement();
		System.out.println("Statement created");
		System.out.println(stmt);
		
		
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
