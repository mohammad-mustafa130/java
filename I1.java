interface I1 {
	I2 printer();
}
interface I2 {
	I3 show();
}
interface I3 {
	void display();
}
class A implements I1 {
	public I2 printer() {
		System.out.println("Printer method");
		return new B();
	}
}
class B implements I2 {
	public I3 show() {
		System.out.println("Show method");
		return new C();
	}
}
class C implements I3 {
	public void display() {
		System.out.println("Display method");
	}
}
class Factory {
	public static I1 getInstance() {
		return new A();
	}
}

