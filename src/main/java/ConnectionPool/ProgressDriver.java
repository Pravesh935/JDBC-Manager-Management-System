package ConnectionPool;

import java.sql.Connection;

public class ProgressDriver {
    public static void main(String[] args) {
    	 ConnectionPool con=new ConnectionPool();
    	 for(Connection c: ConnectionPool.pool) {
    		 System.out.println(c);
    	 }
     Connection	con1= con.getObject();
     System.out.println("------return object 1----");
     System.out.println(con1);
     System.out.println("--------------");
     
     for(Connection c: ConnectionPool.pool) {
		 System.out.println(c);
	 }
 Connection	con2= con.getObject();
 System.out.println("------return object 2----");
 System.out.println(con2);
 System.out.println("--------------");
 
 for(Connection c: ConnectionPool.pool) {
	 System.out.println(c);
 }
Connection	con3= con.getObject();
System.out.println("------return object 3----");
System.out.println(con3);
System.out.println("--------------");

for(Connection c: ConnectionPool.pool) {
	 System.out.println(c);
}
Connection	con4= con.getObject();
System.out.println("------return object 4----");
System.out.println(con4);
System.out.println("--------------");

for(Connection c: ConnectionPool.pool) {
	 System.out.println(c);
}
Connection	con5= con.getObject();
System.out.println("------return object 5----");
System.out.println(con5);
System.out.println("--------------");

for(Connection c: ConnectionPool.pool) {
	 System.out.println(c);
}
Connection	con6= con.getObject();
System.out.println("------return object----");
System.out.println(con6);
System.out.println("--------------");

con.returnConObj(con6);
con.returnConObj(con5);
con.returnConObj(con4);
con.returnConObj(con3);
con.returnConObj(con2);
con.returnConObj(con1);
 
 for(Connection c:ConnectionPool.pool) {
	 System.out.println(c);
 }
     
	}
}
