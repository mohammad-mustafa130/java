
class BinarySearch {
	public static void main(String[] args) {
		int[] arr = {-1, 0, 3, 5, 9, 12};
		int tar = 9;

		int i = 0;
		int j = arr.length - 1;
		int res = binarySearch(arr, i, j, tar);

		if(res == -1) {
			System.out.println("Element not found");
		} else {
			System.out.println("Element found at index " + res);
		}
	}
	public static int binarySearch(int[] arr, int i, int j, int tar) {
		if(i <= j) {
			int mid = i + (j-i)/2;
			if(arr[mid] == tar) return mid;
			else if(arr[mid] >= tar) return binarySearch(arr, i, mid-1, tar);
			else return binarySearch(arr, mid+1, j, tar);
		}
		return -1;
	}
}
