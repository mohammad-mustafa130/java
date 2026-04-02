import java.util.Scanner;
class SinglyCircularLL {
	private class Node {
		int data;
		Node next;
		Node(int x) {
			data = x;
			next = this;
		}
	}
	Node head;
	public SinglyCircularLL() {
		head = null;
	}
	public void createList(int n) {
		Scanner sc = new Scanner(System.in);
		Node temp = null, p = null;

		for(int i = 1; i <= n; i++) {
			System.out.print("Enter node data: ");
			temp = new Node(sc.nextInt());

			if(i == 1)  {
				head = temp;
			} else {
				p = head;

				while(p.next != head) p = p.next;

				p.next = temp;
				temp.next = head;
			}
		}
		System.out.println();
	}
	public void traverse(Node head) {
		Node temp = head;
		if(temp == head) {
			do {
				System.out.print(temp.data + " ");
				temp = temp.next;
			} while(temp != head);
			System.out.println();
		} else {
			System.out.println("List is empty");
		}
		System.out.println();
	}
	public void addNode(int data, int pos) {
		Node temp = new Node(data);
		if(pos == 1) {
			if(head == null) {
				head = temp;
			} else {
				Node p = head;

				while(p.next != head) p = p.next;

				temp.next = head;
				head = temp;
				p.next = temp;
			}
		} else {
			Node p = head;
			int count = 1;

			while((p.next != head) && (count < pos)) { 
				p = p.next;
				count++;
			}
			temp.next = p.next;
			p.next = temp;
		}
	}
	public void deleteNode(int pos) {
		Node p = null, t = null;
		int count = 1;
		if(head == null) {
			System.out.println("Empty List");
		} else if(pos == 1) {
			p = head;
			while(p.next != head) p = p.next;
			t = head;
			head = t.next;
			p.next = head;
			t.next = null;
		} else {
			p = head;
			t = head;
			while((t.next != head) && (count < pos)) {
				p = t;
				t = t.next;
				count++;
			}
			p.next = t.next;
			t.next = null;
		}
	}
}
