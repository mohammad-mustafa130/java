class IntStackLL {
	private class Node {
		int data;
		Node next;
		Node(int x) {
			data = x;
			next = null;
		}
	}
	private Node top;
	public IntStackLL() {
		top = null;
	}
	public void push(int data) {
		Node temp = new Node(data);
		temp.next = top;
		top = temp;
	}
	public int pop() {
		if(top == null) {
			return Integer.MIN_VALUE;
		}
		Node temp = top;
		top = top.next;
		temp.next = null;
		return temp.data;
	}
}
