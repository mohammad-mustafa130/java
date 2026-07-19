class ThreadTester3 {
	public static void main(String[] args) {
		new Thread(() -> {
			for(int i = 0; i < 50000; i++) {
				System.out.println(i);
			}
		}).start();
		new Thread(() -> {
			for(int i = 0; i < 50000; i++) {
				System.out.println(i);
			}
		}).start();
	}
}
