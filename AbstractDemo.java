abstract class AbstractDemo {
	public void display() {
		System.out.println("Display method");
	}
	public abstract void show();
	AbstractDemo() {
		System.out.println("Abstract Demo");
	}
}
class NonAbstractDemo extends AbstractDemo { 
	public void show() {
		System.out.println("Show method");
	}
	NonAbstractDemo() {
		System.out.println("Non Abstract");
	}
}
