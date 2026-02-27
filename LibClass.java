interface MyInterface {
	int add(int x, int y);
}
class LibClass {
	public void caller(MyInterface mi, int a, int b) {
		System.out.println(mi.add(a,b));
	}
}
