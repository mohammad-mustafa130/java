import java.util.Scanner;
public class SinglyLinkedList {
	private class Node {
		int data;
		Node next;
		Node(int x) {
			data = x;
			next = null;
		}
	}
	Node head;
	public SinglyLinkedList() {
		head = null;
	}
	public void createList(int n) {
		Scanner sc = new Scanner(System.in);
		Node p = null;
		for(int i = 1; i <= n; i++) {
			System.out.println("Enter node data: ");
			if(i == 1) {
				head = new Node(sc.nextInt());
				p = head;
			}else {
				p.next = new Node(sc.nextInt());
				p = p.next;
			}
		}
	}
	public void traverse(Node head) {
		if(head != null) {
			do {
				System.out.print(head.data + " ");
				head = head.next;
			} while(head != null);
			System.out.println();
		} else {
			System.out.println("List is empty");
		}
	}
}
