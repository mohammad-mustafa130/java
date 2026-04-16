import java.util.*;
class IteratorTester {
	public static void main(String[] args) {
		List<String> names = new ArrayList<>();

		names.add("Lucknow");
		names.add("Kanpur");
		names.add("Agra");
		names.add("Barabanki");

		Iterator<String> it = names.iterator();

		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
} 
