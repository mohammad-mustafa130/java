import java.util.List;
import java.util.ArrayList;
class ForEachLoop {
	public static void main(String[] args) {
		List<String> al = new ArrayList<>();

		al.add("Lucknow");
		al.add("Kanpur");
		al.add("Unnao");

		for(String s : al) {
			System.out.println(s);
		}
	}
}
