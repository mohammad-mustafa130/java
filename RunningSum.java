class RunningSum {
	public static void main(String[] args) {
		int[] arr = {3, 5, 7, 6, 8, 4, 1};
		for(int i = 1; i < arr.length; i++) {
			arr[i] = arr[i] + arr[i-1];
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
