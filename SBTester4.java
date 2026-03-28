class SBTester4 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Lucknow");
		System.out.println(sb.length() + " " + sb.capacity());

		sb.trimToSize();
		System.out.println(sb.length() + " " + sb.capacity());

		sb.ensureCapacity(50);
		System.out.println(sb.length() + " " + sb.capacity());

		sb.replace(4, 7, "later");
		System.out.println(sb);

		sb.reverse();
		System.out.println(sb);
	}
}
