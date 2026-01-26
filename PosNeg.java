class PosNeg {
	public static void main(String[] args) {
		int arr[] = {2, 4, -3, -5, -7, 8, 4, -2};
		int i = 0;
		int j = arr.length - 1;
		while(i < j){ 
			if(arr[i] > 0 && arr[j] < 0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
			}else j--;
		}
		for(int k = 0; k < arr.length; k++) {
			System.out.print(arr[k]+ " ");
		}
		System.out.println();
	}
}
				
