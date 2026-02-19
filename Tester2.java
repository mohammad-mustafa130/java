class Tester2 {
	public static void main(String[] args) {
		MyClass m1 = new MyClass();
		/*MyInterface mi = new MyInterface() {
			public void display() {
				System.out.println("Display");
			}
		};
		m1.myMethod(mi);
		*/
		m1.myMethod(new MyInterface() {
			public void display() {
				System.out.println("Display");
			}
		});
	}
}
