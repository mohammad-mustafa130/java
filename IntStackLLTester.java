class IntStackLLTester {
	public static void main(String[] args) {
		IntStackLL sl = new IntStackLL();

		sl.push(10);
		sl.push(20);
		sl.push(30);

		System.out.println(sl.pop());
		System.out.println(sl.pop());
		System.out.println(sl.pop());
	}
}
