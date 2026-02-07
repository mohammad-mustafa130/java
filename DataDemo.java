package dpkg;
class DataDemo {
	int a = 10;
	public int b = 20;
	protected int c = 30;
	private int d = 40;

	public static void main(String[] args) {
		DataDemo dd = new DataDemo();
		System.out.println(dd.a);
		System.out.println(dd.b);
		System.out.println(dd.c);
		System.out.println(dd.d);
	}
}
