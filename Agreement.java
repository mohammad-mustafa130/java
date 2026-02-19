interface Agreement {
	void printer();
}
class DoAgreement {
	public void terms(Agreement ag) {
		ag.printer();
	}
}
class A implements Agreement {
	public void printer() {
		System.out.println("Printer");
	}
}
