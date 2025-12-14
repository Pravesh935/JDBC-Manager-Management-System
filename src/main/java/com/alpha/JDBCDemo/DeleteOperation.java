package com.alpha.JDBCDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteOperation {
	public static void main(String[] args) {
		try {
			Class.forName("org.postgresql.Driver");
			System.out.println("Driver Loaded");
			 
			
		Connection con=	DriverManager.getConnection("jdbc:postgresql://localhost:5432/company?user=postgres&password=root");
			System.out.println("Connection Established");
			 
			Statement stmt=   con.createStatement();
			System.out.println("Statement created");
			// write query to perform operation and store it inside String variable
			String query="Delete from employee where id=102";
			// call query("") method to execute query -> it is present in Statement interface;
			boolean out=stmt.execute(query);
			System.out.println(out);
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
