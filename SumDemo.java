class SumDemo {
	public int add(int x, int y) {
		return x+y;
	}
	public int add(int x, int y, int z) {
		return x+y+z;
	}
	public int add(int a, int b, int... x) {
		int result = a+b;
		for(int i = 0; i < x.length; i++) {
			result += x[i];
		}
		return result;
	}
}
