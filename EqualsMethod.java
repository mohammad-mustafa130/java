class EqualsMethod {
	public static void main(String[] args) {
		String s = "Lucknow Junction";
		String s1 = "Lucknow Junction";
		String s2 = "lucknow JUNCTION";
		System.out.println(s.equals(s1));
		System.out.println(s.equals(s2));
		System.out.println(s.equalsIgnoreCase(s2));
	}
}
