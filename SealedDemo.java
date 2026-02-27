public sealed class SealedDemo permits Sealed1 {
	public void printer() {
		System.out.println("Printer method");
	}
}

