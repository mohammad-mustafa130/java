class Parent {
	Parent(int x) {
		System.out.println("Constructor of Parent");
	}
	public void show() {
		System.out.println("Show of Parent");
	}
	private void display() {
		System.out.println("Display of Parent");
	}
}
class Child extends Parent {
	Child() {
		super(5);
		System.out.println("Constructor of Child");
	}
	void printer() {
		System.out.println("Printer of Child");
	}
}
class InheritanceTester {
	public static void main(String[] args) {
		Child ch = new Child();
		ch.show();
		ch.printer();
	}
}
