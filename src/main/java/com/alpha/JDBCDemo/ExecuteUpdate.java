package com.alpha.JDBCDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ExecuteUpdate {
	public static void main(String[] args) {
		try {
			Class.forName("org.postgresql.Driver");
			System.out.println("Driver Loaded");
			 
			
		Connection con=	DriverManager.getConnection("jdbc:postgresql://localhost:5432/company?user=postgres&password=root");
			System.out.println("Connection Established");
			 
			Statement stmt=   con.createStatement();
			System.out.println("Statement created");
			// write query to perform operation and store it inside String variable
			String query="Update employee set age=48 where name='Smith'";
			// call executeUpdate("") method to execute query -> it is present in Statement interface; int return type
			int out=stmt.executeUpdate(query);
			System.out.println("Data Updated");
		    System.out.println("Rows affected:"+out);
			 
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
