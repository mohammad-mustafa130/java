import java.util.Scanner;
class DoublyCircularLL {
	private class Node {
		int data;
		Node prev;
		Node next;
		Node(int x) {
			data = x;
			prev = this;
			next = this;
		}
	}
	Node head;
	public DoublyCircularLL() {
		head = null;
	}
	public void createList(int n) {
		Scanner sc = new Scanner(System.in);
		Node p = null;
		for(int i = 1; i <= n; i++) {
			System.out.print("Enter node data: ");
			Node temp = new Node(sc.nextInt());
			if(i == 1 || head == null) {
				head = temp;
			} else {
				p = head;
				while(p.next != head) {
					p = p.next;
				}
				p.next = temp;
				temp.prev = p;
				temp.next = head;
				head.prev = temp;
			}
		}
		System.out.println();
	}
	public void traverse(Node head) {
		Node temp = head;
		while(temp.next != head) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println(temp.data + " ");
		System.out.println(temp.next.data + " ");

		while(temp != head) {
			System.out.print(temp.data+ " ");
			temp = temp.prev;
		}
		System.out.println(temp.data);
	}
	public void addNode(int data, int pos) {
		Node temp = new Node(data);
		if(pos == 1) {
			if(head == null) {
				head = temp;
			} else {
				temp.next = head;
				temp.prev = head.prev;
				head.prev.next = temp;
				head.prev = temp;
				head = temp;
			}
		} else {
			int count = 1;
			Node p = head, q = head;
			while((p.next != head) && (count < pos)) {
				p = q;
				q = q.next;
				count++;
			}
			p.next = temp;
			temp.prev = p;
			temp.next = q;
			q.prev = temp;
		}
		System.out.println();
	}
	public void deleteNode(int pos) {
		Node p = head, q = head.next;
		if(pos == 1) {
			if(head == null) {
				System.out.println("List is empty");
			} else {
				head = p.next;
				q.prev = head.prev;
				p.prev.next = head;
				p.prev = null;
				p.next = null;
			}
		} else {
			int count = 1;
			while((q.next != head) && (count < pos - 1)) {
				p = q;
				q = q.next;
				count++;
			}
			p.next = q.next;
			q.next.prev = p;
			q.next = null;
			q.prev = null;
		}
		System.out.println();
	}
}

