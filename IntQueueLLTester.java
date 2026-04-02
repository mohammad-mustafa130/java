class IntQueueLLTester {
	public static void main(String[] args) {
		IntQueueLL qu = new IntQueueLL();

		qu.enqueue(10);
		qu.enqueue(20);
		qu.enqueue(30);

		System.out.println(qu.dequeue());
		System.out.println(qu.dequeue());
		System.out.println(qu.dequeue());
	}
}
