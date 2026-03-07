class SLLTester {
	public static void main(String... args) {
		SinglyLinkedList sl = new SinglyLinkedList();
		sl.createList(4);

		System.out.println("Before: ");
		sl.traverse(sl.head);

		//System.out.println("After addNode: ");
		//sl.addNode(50, 3);
		//sl.traverse(sl.head);

		System.out.println("After deletion: ");
		sl.deleteNode(4);
		sl.traverse(sl.head);
	}
}
