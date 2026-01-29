class ImmutableString {
	public static void main(String[] args) {
		String s1 = "Lucknow";
		String s2 = s1;
		System.out.println(s1 == s2);
		s1 = s1 + "Junction";
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1 == s2);
	}
}
