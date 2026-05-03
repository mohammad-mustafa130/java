class ThreadTester {
	public static void main(String[] args) {
		MyThread mt = new MyThread();
		MyThread mt2 = new MyThread();

		mt.setName("RThread");
		mt2.setName("SThread");

		mt.start();
		mt2.start();
	}
}
