class StaticNonStatic {
	{
		System.out.println("This is non static block");
	}
	static {
		System.out.println("This is static block");
	}
	public static void main(String[] args) {
		StaticNonStatic sns1 = new StaticNonStatic();
		StaticNonStatic sns2 = new StaticNonStatic();
	}
}
