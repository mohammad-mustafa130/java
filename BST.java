import java.util.*;

class BST {
	class Node {
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
	public void levelOrderTraversal(Node root) {
		List<List<Integer>> result = new ArrayList<>();

		if(root == null) {
			System.out.println("List is empty");
			return;
		}

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
		System.out.println();
	}
	public void preOrderTraversal(Node root) {
		Stack<Node> st = new Stack<>();
		st.push(root);

		while(!st.empty()) {
			Node node = st.pop();
			System.out.print(node.data + " ");

			if(node.right != null) st.push(node.right);
			if(node.left != null) st.push(node.left);
		}
		System.out.println();
		System.out.println();
	}
	public void postOrderTraversal(Node root) {
		if(root == null) return;

		Stack<Node> st1 = new Stack<>();
		Stack<Integer> st2 = new Stack<>();

		st1.push(root);

		while(!st1.isEmpty()) {
			Node node = st1.pop();
			st2.push(node.data);

			if(node.left != null) st1.push(node.left);
			if(node.right != null) st1.push(node.right);
		}
		while(!st2.isEmpty()) {
			System.out.print(st2.pop() + " ");
		}
		System.out.println();
		System.out.println();
	}
	public void inOrderTraversal(Node root) {
		if(root == null) return;

		Stack<Node> st = new Stack<>();

		while(root != null || !st.isEmpty()) {
			while(root != null) {
				st.push(root);
				root = root.left;
			}
			Node node = st.pop();
			System.out.print(node.data + " ");

			root = node.right;
		}
		System.out.println();
	}
	Node search(Node head, int data) {
		Node temp = head;
		while(temp != null) {
			if(temp.data == data) return temp;
			else if(temp.data < data) temp = temp.right;
			else temp = temp.left;
		}
		return null;
	}
}
