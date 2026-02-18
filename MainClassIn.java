interface MyInterface {
	int x = 10;
	void display();
}
class MyClass implements MyInterface {
	public void display() {
		System.out.println("Display method");
	}
}
class MainClassIn {
	public static void main(String[] args) {
		MyClass m1 = new MyClass();
		System.out.println(MyInterface.x);
		m1.display();
	}
}
