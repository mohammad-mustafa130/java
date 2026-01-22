class ReverseArray {
	public static void main(String[] args) {
		int arr[] = {3, 5, 7, 6, 8, 4, 1};
		int i = 0;
		int j = arr.length - 1;
		while(i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
		for(int k = 0; k < arr.length; k++) {
			System.out.print(arr[k]+" ");
		}
		System.out.println();
	}
}
