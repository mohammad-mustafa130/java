import java.util.*;

class MapTester4 {
	public static void main(String[] args) {
		Map<String, String> mp = new LinkedHashMap<>();

		mp.put("name", "Azeem");
		mp.put("city", "Lucknow");
		mp.put("country", "India");

		Set<String> k = mp.keySet();

		for(String s : k) {
			System.out.println(s + " " + mp.get(s));
		}
	}
}
