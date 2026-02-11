class FactoryDemo {
	int age;
	String name;
	public static FactoryDemo fd = null;
	private FactoryDemo(int a, String s) {
		age = a;
		name = s;
	}
	public static FactoryDemo factory(int x, String y) {
		if(fd == null) {
			fd = new FactoryDemo(x,y);
		}
		return fd;
	}
}
class FactoryTester {
	public static void main(String[] args) {
		FactoryDemo fd1 = FactoryDemo.factory(20, "Neeraj");
		FactoryDemo fd2 = FactoryDemo.factory(30, "Rahul");
		System.out.println(fd1.age+ " "+fd1.name);
		System.out.println(fd2.age+" "+fd2.name);
	}
}
