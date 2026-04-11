import java.util.Set;
import java.util.HashSet;
class SetTest {
	public static void main(String[] args) {
		int[] arr = {2, 4, 8, 2, 7, 15, 18, 7, 18, 25, 37, 32, 2, 8};
		Set<Integer> st = new HashSet<>();
		for(int i = 0; i < arr.length; i++) {
			st.add(arr[i]);
		}
		System.out.println(st.size());
	}
} 
