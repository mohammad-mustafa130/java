class Outer {
	static private String name = "Manoj Kumar";
	static class Inner {
		private int age;
		Inner(int a) {
			age = a;
		}
		public void printer() {
			System.out.println(age);
			System.out.println(name);
		}
	}
}
