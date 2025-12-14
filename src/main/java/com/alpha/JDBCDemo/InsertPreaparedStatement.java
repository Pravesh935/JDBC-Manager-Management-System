package com.alpha.JDBCDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertPreaparedStatement {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			Class.forName("org.postgresql.Driver");
			System.out.println("Driver Loaded");
			 
			
		Connection con=	DriverManager.getConnection("jdbc:postgresql://localhost:5432/company?user=postgres&password=root");
			System.out.println("Connection Established");
			/*
			 * After the connection establishment we will write query, which we will use while creating statement.
			 */
			  String query="insert into employee values(?,?,?)";
			 //PreaparedStatement is used for dynamic execution. it use preapareStatement(query)
			 //using setter() of PreaparedStatment type we can add data;
			  /*
			   * here we write query before creating statement 
			   * pass query in prepareStatement() method --> con.prepareStatement(query)
			   */
			  PreparedStatement pstmt=con.prepareStatement(query);
			  System.out.println("Enter id");
			  pstmt.setInt(1, sc.nextInt());
			  System.out.println("Enter name");
			  pstmt.setString(2, sc.next());
			  System.out.println("Enter age");
			  pstmt.setInt(3, sc.nextInt());
			 pstmt.executeUpdate();
			 System.out.println("Data enterd");
			 sc.close();
			 
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
