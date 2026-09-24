class IsSorted {
	public static void main(String[] args) {
		int[] arr = {1,2,8,4,5};
		int n = arr.length - 1;
		boolean res = isSorted(arr, n);
		System.out.println(res);
	}
	public static boolean isSorted(int[] arr, int n) {
		if(n == 0 || n == 1) return true;

		if(arr[n] >= arr[n-1]) return isSorted(arr, n-1);
		return false;
	}
}
