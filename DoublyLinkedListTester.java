class DoublyLinkedListTester {
	public static void main(String[] args) {
		DoublyLinkedList dl = new DoublyLinkedList();

		dl.createList(5);
		System.out.println("List: ");
		dl.traverse(dl.head);

		/*dl.addNode(60, 6);
		
		System.out.println("After adding a node: ");
		dl.traverse(dl.head);*/

		System.out.println("After deleting a node: ");
		dl.deleteNode(5);
		dl.traverse(dl.head);
	}
}
