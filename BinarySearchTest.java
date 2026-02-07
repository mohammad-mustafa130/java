class BinarySearch {
	public int binarySearch(int[] a, int low, int high, int data) {
		if(low <= high) {
			int mid = (low+high)/2;
			if(data == a[mid]) {
				return mid;
			} else if(data < a[mid]) {
				return binarySearch(a, low, mid-1, data);
			} else if(data > a[mid]) {
				return binarySearch(a, mid+1, high, data);
			} 
		}
		return -1;
	}
}
class BinarySearchTest {
	public static void main(String[] args) {
		int[] arr = {2,6,10,15,25,70,89,95};
		int target = 89;
		int low = 0;
		int high = arr.length - 1;

		BinarySearch bs = new BinarySearch();
		int result = bs.binarySearch(arr, low, high, target);
		if(result == -1) {
			System.out.println("Element not found");
		} else {
			System.out.println("Element found at index "+result);
		}
	}
}
