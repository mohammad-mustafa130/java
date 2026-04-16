import java.util.*;

class BST {
	private class Node {
		int data;
		Node left;
		Node right;
		Node(int x) {
			data = x;
			left = null;
			right = null;
		}
	}
	Node root;
	public BST() {
		root = null;
	}
	public void createTree(int n) {
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < n; i++) {
			System.out.print("Enter node data: ");
			Node temp = new Node(sc.nextInt());

			if(root == null) root = temp;
			else {
				Node p = root, q = root;
				while(p != null) {
					q = p;
					if(temp.data > p.data) p = p.right;
					else p = p.left;
				}
				if(temp.data > q.data) q.right = temp;
				else q.left = temp;
			}
		}
		System.out.println();
	}
	public void traverseTree(Node root) {
		List<List<Integer>> result = new ArrayList<>();

		if(root == null) System.out.println("List is empty");

		Queue<Node> q = new ArrayDeque<>();
		q.offer(root);

		while(!q.isEmpty()) {
			int size = q.size();
			List<Integer> level = new ArrayList<>();

			for(int i = 0; i < size; i++) {
				Node node = q.poll();
				level.add(node.data);

				if(node.left != null) q.offer(node.left);
				if(node.right != null) q.offer(node.right);
			}
			result.add(level);
		}
		List<Integer> list = new ArrayList<>();
		for(List<Integer> l : result) {
			list.addAll(l);
		}
		System.out.println(list);
	}
}
