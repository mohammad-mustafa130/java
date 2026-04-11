import java.util.Hashtable;

class HashTableDemo {
	public static void main(String[] args) {
		Hashtable<String, String> ht = new Hashtable<>();

		ht.put("name", "Amit Kumar");
		ht.put("city", "Lucknow");
		ht.put("age", "20");

		String n = ht.get("name");
		String a = ht.get("age");

		System.out.println(n);
		System.out.println(a);
	}
}
