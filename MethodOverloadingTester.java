class Parent {
	public int add(int x, int y) {
		return x+y;
	}
	public int add(int x, int y, int z) {
		return x+y+z;
	}
}
class Child extends Parent {
	public int add(int a, int b, int c, int d) {
		return a+b+c+d;
	}
	public int add(int a, int b) {
		return a+b+10;
	}
	public int mux(int a, int b) {
		return a*b;
	}
}
class MethodOverloadingTester {
	public static void main(String[] args) {
		Parent p = new Child();
		System.out.println(p.add(2,3));
		System.out.println(p.add(5,10,15));
		System.out.println(p.add(2,5,7,9));
		System.out.prinltn(p.mux(2,3));
	}
}
