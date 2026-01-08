class StaticDemo {
	int x = 10;
	static int y = 20;
	public static void main(String[] args) {
		StaticDemo sd1 = new StaticDemo();
		StaticDemo sd2 = new StaticDemo();

		System.out.println(sd1.x);
		System.out.println(sd1.y);

		System.out.println(sd2.x);
		System.out.println(sd2.y);

		sd1.x = 15;
		sd2.y = 25;

		System.out.println(sd1.x);
		System.out.println(sd1.y);

		System.out.println(sd2.x);
		System.out.println(sd2.y);
	}
}
