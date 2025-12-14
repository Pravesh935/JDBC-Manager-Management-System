package ManagerOperation;

 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



 
public class ManagerDAO {
	static Connection con;
	static {
		try {
			Class.forName("org.postgresql.Driver");
			System.out.println("Driver Loaded");
			  con=	DriverManager.getConnection("jdbc:postgresql://localhost:5432/company?user=postgres&password=root");
			System.out.println("Connection Established");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void insertManager(Manager m) {
		 
		  String query="insert into manager values(?,?,?)";
		try {
			PreparedStatement pstmt	=con.prepareStatement(query);
			pstmt.setInt(1, m.getId());
			pstmt.setString(2,m.getName());
			pstmt.setInt(3, m.getSal());
			int row=pstmt.executeUpdate();
			System.out.println(row+" row inserted");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}

	public Manager selectManager( int id) {
		 try {
			 
			String query="Select * from manager where id=?";
			PreparedStatement pstmt=con.prepareStatement(query);
			pstmt.setInt(1, id);
			  ResultSet rs= pstmt.executeQuery();
			  rs.next();
			  
			   id=rs.getInt(1);
			   String name=rs.getString(2);
			   int sal=rs.getInt(3);
			   return new Manager(id, name, sal);
		 } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		 }
		 return null;
		 
		
	}

	 
	public void deleteManager(int id) {
		
		
		try {
			String query="delete from manager where id=?";
			PreparedStatement pstmt=con.prepareStatement(query);
			pstmt.setInt(1, id);
		
		 int row=pstmt.executeUpdate();
			System.out.println(row+" row deleted ");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void updateManager( int id, String name) {
 		 try {
			 String query="update manager set name=? where id=?";
			PreparedStatement pstmt=con.prepareStatement(query);
			pstmt.setString(1,name);
			pstmt.setInt(2,id);
		int row=	pstmt.executeUpdate();
		System.out.println("row updated "+ row);
            
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
   
}
