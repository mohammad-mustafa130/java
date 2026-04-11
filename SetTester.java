import java.util.Set;
import java.util.HashSet;
class SetTester {
	public static void main(String[] args) {
		Set<String> st = new HashSet<>();

		st.add("Lucknow");
		st.add("Kanpur");
		st.add("Unnao");

		System.out.println(st.size());

		st.add("Kanpur");
		System.out.println(st.size());
	}
}
