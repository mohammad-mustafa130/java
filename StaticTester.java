class StaticDemo {
	public static int x = 10;
	public int y = 20;
	public void display() {
		System.out.println(x+" "+y);
	}
}
class StaticTester {
	public static void main(String[] args) {
		StaticDemo sd1 = new StaticDemo();
		StaticDemo sd2 = new StaticDemo();

		sd1.display();
		sd2.display();

		sd1.x = 15;
		sd1.y = 30;

		sd1.display();
		sd2.display();
	}
}
