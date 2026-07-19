class MyWork {
	synchronized public static void job() {
		for(int i = 0; i < 5000; i++) {
			System.out.println(i);
		}
	}
}
