class ThisDemo {
	private int x;
	ThisDemo(int a) {
		x = a;
	}
	public void display() {
		System.out.println(this.x);
	}
}
class ThisTester {
	public static void main(String[] args) {
		ThisDemo td1 = new ThisDemo(50);
		td1.display();
		ThisDemo td2 = new ThisDemo(20);
		td2.display();
	}
}
