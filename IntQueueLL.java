class IntQueueLL {
	private class Node {
		int data;
		Node next;
		Node(int x) {
			data = x;
			next = null;
		}
	}
	private Node front;
	private Node rear;
	public IntQueueLL() {
		front = null;
		rear = null;
	}
	public void enqueue(int data) {
		Node temp = new Node(data);
		if((front == null) && (rear == null)) { 
			front = temp;
			rear = temp;
		} else {
			rear.next = temp;
			rear = rear.next;
		}
	}
	public int dequeue() {
		if(front == null) {
			return Integer.MIN_VALUE;
		}
		Node temp = front;
		front = front.next;
		temp.next = null;
		if(front == null) rear = null;
		return temp.data;
	}
}
