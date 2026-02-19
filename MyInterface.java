interface MyInterface {
	static void mymethod() {
		System.out.println("my method");
	}
	default void display() { }
	default void show() { }
	default void printer() { }
}

