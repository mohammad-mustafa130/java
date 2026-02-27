sealed interface MyInterface {
	void printer();
}
final class A implements MyInterface {
	public void printer() {
		System.out.println("Printer");
	}
}
class SealedInterface {
	public static void main(String[] args) {
		A a = new A();
		a.printer();
	}
}
