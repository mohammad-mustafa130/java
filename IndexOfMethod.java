class IndexOfMethod {
	public static void main(String[] args) {
		String s = "Lucknow";
		System.out.println(s.charAt(1));
		System.out.println(s.indexOf('n'));
		String st = "Lucknow Junction";
		System.out.println(st.lastIndexOf('n'));
		char[] ch = s.toCharArray();
		System.out.println(ch.length);
		String s5 = new String(ch);
	}
}
