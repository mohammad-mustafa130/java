class QueueTester {
	public static void main(String[] args) {
		IntQueue iq = new IntQueue(10);

		iq.enqueue(10);
		iq.enqueue(20);
		iq.enqueue(30);

		System.out.println(iq.dequeue());
		System.out.println(iq.dequeue());
		System.out.println(iq.dequeue());
	}
}
