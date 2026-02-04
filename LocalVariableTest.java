class LocalVariableTest {
	void printer() {
		int i = 10;
		if(true) {
			System.out.println(i);
		}
		System.out.println(i);
	}
	public static void main(String[] args) {
		LocalVariableTest lt = new LocalVariableTest();
		lt.printer();
	}
}	
