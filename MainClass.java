class DemoTester {
	int age;
	private DemoTester() {
		age = 20;
	}
	public void display() {
		System.out.println("Display method");
	}
	public static DemoTester getInstance() {
		return new DemoTester();
	}
}
class MainClass {
	public static void main(String[] args) {
		DemoTester dt = DemoTester.getInstance();
		dt.display();
		System.out.println(dt.age);
	}
}
