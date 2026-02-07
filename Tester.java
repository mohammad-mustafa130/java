class Tester {
	public int fact(int n) {
		if(n == 0 || n == 1) return 1;
		return n * fact(n-1);
	}
	// Factorial using for loop
	public int factorial(int n) {
		int result = 1;
		for(int i = 1; i <= n; i++) {
			result *= i;
		}
		return result;
	}
	public int power(int a, int n) {
		if(n == 0) return 1;
		if(n == 1) return a;
		return a * power(a, n-1);
	}
	public int sum(int n) {
		if(n == 1) return 1;
		return n+sum(n-1);
	}
	public int fib(int n) {
		if(n == 1 || n == 2) return 1;
		return fib(n-1)+fib(n-2);
	} 
	public static void main(String[] args) {
		Tester t = new Tester();
		int factorial = t.factorial(5);
		System.out.println("Factorial of 5 = "+factorial);
		
		int pow = t.power(3,4);
		System.out.println("Power(3,4) = "+pow);

		int s = t.sum(5);
		System.out.println("Sum of first 5 natural number = "+s);

		int fi = t.fib(5);
		System.out.println("5th number in a Fibonacci Series = "+fi); 
	}
}
