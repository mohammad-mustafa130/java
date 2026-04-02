class SinglyCircularLLTester {
	public static void main(String[] args) {
		SinglyCircularLL sc = new SinglyCircularLL();

		sc.createList(5);

		System.out.println("Linked List: ");
		sc.traverse(sc.head);

		/*sc.addNode(60, 6);

		System.out.println("After adding a node: ");
		sc.traverse(sc.head);
		*/

		sc.deleteNode(5);

		System.out.println("After deleting a node: ");
		sc.traverse(sc.head);
	}
}
