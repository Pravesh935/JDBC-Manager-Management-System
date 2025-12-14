package com.alpha.JDBCDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedBatch {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			Class.forName("org.postgresql.Driver");
			System.out.println("Driver Loaded");
			 
			
		Connection con=	DriverManager.getConnection("jdbc:postgresql://localhost:5432/company?user=postgres&password=root");
			System.out.println("Connection Established");
			  String query="insert into employee values(?,?,?)";
			  PreparedStatement pstmt=con.prepareStatement(query);
			  int i=1;
			  while(i<=3) {
				  System.out.println("Enter id");
				  pstmt.setInt(1, sc.nextInt());
				  System.out.println("Enter name");
				  pstmt.setString(2, sc.next());
				  System.out.println("Enter age");
				  pstmt.setInt(3, sc.nextInt());
				  // first add the data inside batch to reduce number of hits on database(to overcome throughput problem)
				  pstmt.addBatch();
				  System.out.println("Data added to batch");
				  i++;
			  }
			 //after adding data inside batch, execute batch it will hit database only one time( we can execute multiple instruction 
			  // in one hit)
			   pstmt.executeBatch();
			 System.out.println("Data enterd");
			 
			 
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sc.close();
	}
}
