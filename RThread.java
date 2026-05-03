class RThread implements Runnable {
	public void run() {
		for(int i = 0; i < 50000; i++) {
			System.out.println(Thread.currentThread().getName()+ ": " + i);
		}
	}
}
