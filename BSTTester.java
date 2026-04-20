class BSTTester {
	public static void main(String[] args) {
		BST b = new BST();

		b.createTree(7);

		System.out.println("Level Order Traversal: ");
		b.levelOrderTraversal(b.root);

		
		System.out.println("PreOrder Traversal: ");
		b.preOrderTraversal(b.root);

		System.out.println("PostOrder Traversal: ");
		b.postOrderTraversal(b.root);

		System.out.println("Inorder Traversal: ");
		b.inOrderTraversal(b.root);

		BST.Node node = b.search(b.root, 70);
		if(node == null) {
			System.out.println("Element not found");
		}
		else System.out.println("Element found");
	}
}
