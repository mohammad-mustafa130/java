class BSTTester {
	public static void main(String[] args) {
		BST b = new BST();

		b.createTree(7);

		System.out.println("Level Order Traversal: ");
		b.traverseTree(b.root);

		
		System.out.println("PreOrder Traversal: ");
		b.preOrderTraversal(b.root);

		System.out.println("PostOrder Traversal: ");
		b.postOrderTraversal(b.root);

		System.out.println("Inorder Traversal: ");
		b.inOrderTraversal(b.root);
	}
}
