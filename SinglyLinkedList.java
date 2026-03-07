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
	public void addNode(int data, int pos) {
		Node temp = new Node(data);
		if(pos == 1 || head == null) {
			temp.next = head;
			head = temp;
		} else {
			int count = 1;
			Node p = head;
			while(p.next != null && count < pos - 1) {
				p = p.next;
				count++;
			}
			temp.next = p.next;
			p.next = temp;
		}
	}
	public void deleteNode(int pos) {
		Node p, q;
		if(head == null) {
			System.out.println("Empty List");
		}
		else if(pos == 1) {
			p = head;
			head = p.next;
			p.next = null;
		} else {
			int count = 1;
			p = head;
			q = head;
			while(q.next != null && count < pos) {
				p = q;
				q = q.next;
				count++;
			}
			p.next = q.next;
			q.next = null;
		}
	}
}
