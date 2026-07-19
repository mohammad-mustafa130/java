class ThreadTester2 {
	public static void main(String[] args) {
		Runnable r = () -> {
			for(int i = 0; i < 50000; i++) {
				System.out.println(Thread.currentThread().getName() + ": " + i);
			}
		};
		Thread t1 = new Thread(r);
		t1.setPriority(7);
		t1.setName("First Thread");

		Thread t2 = new Thread(r);
		t2.setPriority(10);
		t2.setName("Second Thread");

		t1.start();
		t2.start();
	}
}
