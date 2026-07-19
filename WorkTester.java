class WorkTester {
	public static void main(String[] args) {
		new Thread(() -> {
			MyWork.job();
		}).start();
		new Thread(() -> {
			MyWork.job();
		}).start();
	}
}
