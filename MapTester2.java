import java.util.*;
class MapTester2 {
	public static void main(String[] args) {
		Map<String, Integer> freq = new HashMap<>();

		freq.put("Lucknow", 1);
		freq.put("Kanpur", 1);

		Integer i = freq.get("Kanpur");
		System.out.println(i);
	}
}
