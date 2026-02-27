public  sealed class Sealed1 extends SealedDemo permits SealedChild {
	public void display() {
		System.out.println("Display method");
	}
}

