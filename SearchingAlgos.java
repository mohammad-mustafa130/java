public class SearchingAlgos {
	public int search(int[] arr, int data) {
		int foundat = -1;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == data) {
				foundat = i;
				break;
			}
		}
		return foundat;
	}
}
class Factory {
	public static SearchingAlgos getInstance() {
		return new NewSearchingAlgos();
	}
}
