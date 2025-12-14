package ManagerOperation;

public class Manager {
private int id;
private String name;
private int sal;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getSal() {
	return sal;
}
public void setSal(int sal) {
	this.sal = sal;
}
public Manager(int id, String name, int sal) {
	super();
	this.id = id;
	this.name = name;
	this.sal = sal;
}
public Manager() {
	super();
}
@Override
public String toString() {
	return "Manager [id=" + id + ", name=" + name + ", sal=" + sal + "]";
}

}
