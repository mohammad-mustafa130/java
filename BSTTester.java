class BSTTester {
	public static void main(String[] args) {
		BST b = new BST();

		b.createTree(7);

		System.out.println("Tree: ");
		b.traverseTree(b.root);
	}
}
