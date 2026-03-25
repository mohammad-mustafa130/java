class SBTester3 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Lucknow");
		System.out.println(sb);

		sb.insert(4, "for");
		System.out.println(sb);

		sb.delete(7, 10);
		System.out.println(sb);
	}
}
