class DequeTester {
	public static void main(String[] args) {
		Deque d = new Deque();

		System.out.println("Queue: ");
		d.enqueue1(10);
		d.enqueue1(20);
		d.enqueue1(30);
		d.enqueue2(40);

		System.out.print(d.dequeue1() + " ");
		System.out.print(d.dequeue1() + " ");
		System.out.print(d.dequeue1() + " ");
		System.out.println(d.dequeue2());

	}
}
