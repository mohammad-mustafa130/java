import java.util.Scanner;
class DoublyLinkedList {
	private class Node {
		Node prev;
		Node next;
		int data;
		Node(int x) {
			data = x;
			prev = null;
			next = null;
		}
	}
	Node head;
	public DoublyLinkedList() {
		head = null;
	}
	public void createList(int n) {
		Scanner sc = new Scanner(System.in);
		Node temp = null, t = null;
		for(int i = 1; i <= n; i++) {
			System.out.print("Enter node data: ");
			temp = new Node(sc.nextInt());
			if(i == 1) {
				head = temp;
				t = head;
			} else {
				t.next = temp;
				temp.prev = t;
				t = t.next;
			}
		}
		System.out.println();
	}
	public void traverse(Node head) {
		Node temp = null;
		if(head == null) {
			System.out.println("List is empty");
		} else {
			do {
				System.out.print(head.data + " ");
				temp = head;
				head = head.next;
			} while(head != null);
		}
		System.out.println();
		/*if(head == null) {
			do {
			System.out.print(temp.data + " ");
			temp = temp.prev;
			} while(temp != null);
		}
		System.out.println();*/
	}
	public void addNode(int data, int pos) {
		Node temp = new Node(data);
		if(pos == 1) {
			if(head == null) {
				head = temp;
			} else {
				temp.next = head;
				head.prev = temp;
				head = temp;
			}
		} else {
			if(head == null) {
				System.out.println("Node cannot be inserted at given position");
			}
			else {
				int count = 1;
				Node p = head, q = head;
				while((q != null) && (count < pos)) {
					p = q;
					q = q.next;
					count++;
				}
				temp.prev = p;
				temp.next = q;
				p.next = temp;
				if(q != null) q.prev = temp;
			}
		}
	}
	public void deleteNode(int pos) {
		Node p = head, q = head.next;
		if(pos == 1) {
			if(head == null) {
				System.out.println("List is empty");
			} else {
				head = p.next;
				q.prev = null;
				p.next = null;
			}
		} else {
			int count = 1;
			while((q.next != null) && (count < pos-1)) {
				p = q;
				q = q.next;
				count++;
			}
			p.next = q.next;
			q.next = null;
			q.prev = null;
			if(q.next != null) q.next.prev = p;
		}
	}
}
