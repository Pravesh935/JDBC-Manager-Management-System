package ConnectionPool;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ConnectionPool {
 public static List<Connection> pool= new ArrayList<Connection>();
 private static int poolsize=5;
 static {
	 try {
		Class.forName("org.postgresql.Driver");
		System.out.println("Driver loaded");
	 } catch (ClassNotFoundException e) {
		 
		e.printStackTrace();
	 }
	 for(int i=1;i<=poolsize;i++) {
		 pool.add(createConObj());
	 }
 }
 private static Connection createConObj() {
	 Connection con=null;
	 try {
	con=	DriverManager.getConnection("jdbc:postgresql://localhost:5432/company","postgres","root");
	} catch (SQLException e) {
		  
		e.printStackTrace();
	}
	 return con;
 }
 public Connection getObject() {
	 if(pool.size()>0) {
		return pool.remove(pool.size()-1);
	 }
	 return createConObj();
   }
  
 public void returnConObj(Connection obj) {
	 if(pool.size()<poolsize) {
		 pool.add(obj);
	 }
	 try {
		obj.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
 }
  



}
