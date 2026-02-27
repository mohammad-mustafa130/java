class VariableArity {
	public static void main(String... args) {
		SumDemo sd = new SumDemo();
		int a = sd.add(5,3);
		System.out.println(a);

		int b = sd.add(5,4,9);
		System.out.println(b);
	
		int c = sd.add(5,8,1,7,2,9);
		System.out.println(c);
	}
}
