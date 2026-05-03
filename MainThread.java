class MainThread {
	public static void main(String[] args) {
		Runnable r = new RThread();
		Thread t = new Thread(r, "RThread");
		Thread t2 = new Thread(r, "SThread");
		t.start();
		t2.start();
	}
}
