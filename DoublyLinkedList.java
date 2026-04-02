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
		System.out.println();

		if(head == null) {
			do {
			System.out.print(temp.data + " ");
			temp = temp.prev;
			} while(temp != null);
		}
		System.out.println();
	}
}
