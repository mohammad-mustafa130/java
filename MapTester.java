import java.util.Map;
import java.util.TreeMap;
import java.util.Set;

class MapTester {
	public static void main(String[] args) {
		Map<String, String> mp = new TreeMap<>();

		mp.put("name", "Ajay Kumar");
		mp.put("city", "Lucknow");
		mp.put("college", "Integral University");

		Set<String> st = mp.keySet();
		for(String key : st) {
			System.out.println(key + " " + mp.get(key));
		}
	}
}
