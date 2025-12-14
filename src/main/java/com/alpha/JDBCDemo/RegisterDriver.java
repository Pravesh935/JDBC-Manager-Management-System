package com.alpha.JDBCDemo;

import java.sql.DriverManager;
import java.sql.SQLException;
// 1. Register-->registerDriver(Driver d) present in DriverManager class, Exception SQL exception
// we need to create the object of Driver class to register


import org.postgresql.Driver;

public class RegisterDriver {
 public static void main(String[] args) {
	Driver d=new Driver();
	try {
		DriverManager.registerDriver(d);
		System.out.println("Driver Registered");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
