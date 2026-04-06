class DoublyCircularLLTester {
	public static void main(String[] args) {
		DoublyCircularLL dc = new DoublyCircularLL();

		dc.createList(5);

		System.out.println("List: ");
		dc.traverse(dc.head);

		dc.addNode(60, 6);

		System.out.println("After adding a node: ");
		dc.traverse(dc.head);

		dc.deleteNode(6);

		System.out.println("After deleting a node: ");
		dc.traverse(dc.head);
	}
}
