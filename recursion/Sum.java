class Sum {
	public static void main(String[] args) {
		int n = 10;
		int res = sum(n);
		System.out.println(res);
	}
	public static int sum(int n) {
		if(n == 1) return 1;

		return n + sum(n-1);
	}
}
