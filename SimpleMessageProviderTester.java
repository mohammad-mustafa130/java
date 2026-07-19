class SimpleMessageProviderTester {
	public static void main(String[] args) {
		MessageProvider mp = new SimpleMessageProvider();
		MessageRenderer mr = new StandardOutputMessageRenderer();

		mr.setMessageProvider(mp);
		mr.render();
	}
}
