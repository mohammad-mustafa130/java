class Deque {
	private class Node {
		Node prev;
		int data;
		Node next;
		Node(int x) {
			data = x;
			prev = null;
			next = null;
		}
	}
	private Node r1;
	private Node r2;
	private Node f1;
	private Node f2;

	public Deque() {
		r1 = null;
		r2 = null;
		f1 = null;
		f2 = null;
	}
	public void enqueue1(int data) {
		Node temp = new Node(data);
		if(r1 == null) {
			r1 = temp;
			f1 = temp;
			r2 = temp;
			f2 = temp;
		} else {
			r1.next = temp;
			temp.prev = r1;
			r1 = r1.next;
			f2 = f2.next;
		}
	}
	public int dequeue1() {
		if(f1 == null) {
			return Integer.MIN_VALUE;
		}
		Node temp = f1;
		f1 = f1.next;
		r2 = r2.next;
		if(f1 == null && r2 == null) {
			f2 = null;
			r1 = null;
		} 
		temp.next = null;
		return temp.data;
	}
	public void  enqueue2(int data) {
		Node temp = new Node(data);
		if(r2 == null) {
			r2 = temp;
			r1 = temp;
			f1 = temp;
			f2 = temp;
		} else {
			temp.prev = r2.prev;
			temp.next = r2;
			r2.prev = temp;
			r2 = r2.prev;
			f1 = f1.prev;
		}
	}
	public int dequeue2() {
		if(f2 == null) {
			return Integer.MIN_VALUE;
		} else {
			Node temp = f2;
			f2 = f2.prev;
			r1 = r1.prev;
			if(f2 == null && r1 == null) {
				r2 = null;
				f1 = null;
			}
			temp.prev = null;
			return temp.data;
		}
	}
} 
