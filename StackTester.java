class StackTester {
	public static void main(String[] args) {
		IntStack st = new IntStack(10);

		st.push(10);
		st.push(20);
		st.push(30);

		int len = st.getSize();
		for(int i = 1; i <= len; i++) {
			System.out.println(st.pop());
		}
	}
}
