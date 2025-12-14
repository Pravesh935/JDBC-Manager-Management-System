package com.alpha.JDBCDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ExecuteQuery {
	public static void main(String[] args) {
		try {
			Class.forName("org.postgresql.Driver");
			System.out.println("Driver Loaded");

			Connection con = DriverManager
					.getConnection("jdbc:postgresql://localhost:5432/company?user=postgres&password=root");
			System.out.println("Connection Established");

			Statement stmt = con.createStatement();
			System.out.println("Statement created");
			// write query to perform operation and store it inside String variable
			String query = "Select * from employee";
			// call executeQuery("") method to execute query -> it is present in Statement
			// interface; ResultSet return type
			// store it inside refernceVariable of ResultSet
			ResultSet rs = stmt.executeQuery(query);
			System.out.println(rs);
			System.out.println("Data Fetched");
			while (rs.next()) {
				System.out.println("id " + rs.getInt(1));
				System.out.println("name " + rs.getString(2));
				System.out.println("age " + rs.getInt(3));
				System.out.println("-------");
			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
