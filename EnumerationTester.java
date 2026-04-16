import java.util.*;
class EnumerationTester {
	public static void main(String[] args) {
		Vector<String> vt = new Vector<>();

		vt.add("Mustafa");
		vt.add("Ali");
		vt.add("Yusuf");

		Enumeration<String> e = vt.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}
}
