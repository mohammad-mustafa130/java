import java.util.*;

class QueueTester2 {
	public static void main(String[] args) {
		Deque<String> deque = new ArrayDeque<>();

		deque.offerFirst("Lucknow");
		deque.offerLast("Kanpur");
		deque.offerFirst("Unnao");

		while(deque.peekFirst() != null) {
			System.out.println(deque.pollFirst());
		}
	}
}
