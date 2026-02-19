class InterfaceTester {
	public static void main(String[] args) {
		I1 i1 = Factory.getInstance();
		I2 i2 = i1.printer();
		I3 i3 = i2.show();
		i3.display();
	}
}
