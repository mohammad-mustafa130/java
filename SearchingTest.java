class SearchingTest {
	public static void main(String[] args) {
		int[] a = {2,20,8,7,15,4,9,58};
		int x = 4;
		SearchingAlgos sa = new SearchingAlgos();
		int result = sa.linearSearch(a,x);
		if(result == -1) {
			System.out.println("Data not found");
		} else {
			System.out.println("Found at "+result);
		}
	}
}
