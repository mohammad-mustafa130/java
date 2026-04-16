import java.util.*;
class MapTester3 {
	public static void main(String[] args) {
		Map<String, String> person = new HashMap<>();

		person.put("name", "Azeem");
		person.put("city", "Lucknow");
		person.put("country", "India");

		Set<String> k = person.keySet();
		for(String s : k) {
			System.out.println(s + " " + person.get(s));
		}
		System.out.println();

		Collection<String> v = person.values();
		Iterator<String> it = v.iterator();

		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println();

		for(Map.Entry<String, String> entry : person.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		System.out.println();

		
	}
}
