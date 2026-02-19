class MainClass3 {
	public static void main(String[] args) {
		NoAdapterDemo nad = new NoAdapterDemo();
		nad.display();
		nad.mymethod();

		MyInterface.mymethod();

		/*MyInterface2 mi = new MyClass();
		mi.m1();
		//mi.m2();
		
		MyClass m = new MyClass();
		m.m1();
		m.m2();*/
	}
}
