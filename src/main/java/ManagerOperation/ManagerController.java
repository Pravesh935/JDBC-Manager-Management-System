package ManagerOperation;

import java.util.Scanner;

public class ManagerController {
public static void main(String[] args) {
	ManagerDAO dao=new ManagerDAO();
	Scanner sc=new Scanner(System.in);
	boolean flag=true;
	while(flag) {
		System.out.println("Enter your choice");
		System.out.println("1: insert manager");
		System.out.println("2: find manager");
		System.out.println("3:delete manager");
		System.out.println("4:update manager");
		System.out.println("5: exit");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:{
			System.out.println("Enter id");
			int id=sc.nextInt();
			System.out.println("Enter name");
			String name=sc.next();
			System.out.println("Enter salary");
			int sal=sc.nextInt();
			Manager m=new Manager(id,name,sal);
			dao.insertManager(m);
;			break;
		}
		case 2:{
			System.out.println("Enter id ");
			int id=sc.nextInt();
			Manager m=dao.selectManager(id);
			System.out.println(m);
			break;
		}
		case 3:{
			System.out.println("Enter id ");
			int id=sc.nextInt();
			dao.deleteManager(id);
			break;
		}
		case 4:{
			System.out.println("Enter id ");
			int id=sc.nextInt();
			System.out.println("Enter name");
			String name=sc.next();
			dao.updateManager(id,name);
			break;
		}
		case 5:{
			flag=false;
			System.out.println("thank you");
			break;
		}
		}
	}
	sc.close();
}
}
