package mypkg;
import java.io.Serializable;
public class Employee extends Manager implements MyInterface, Serializable {
	int age;
	String name;
	public Employee() {
		age = 30;
		name = "Amit Kumar";
	}
	public void display() {
		System.out.println(age);
		System.out.println(name);
	}
}
class Manager {
	public void show() {
		System.out.println("Manager Class");
	}
}
interface MyInterface { }
