class TransposeMatrix {
	public static void main(String[] args) {
		int arr[][] = {{2,3,5},{7,9,10},{15,4,6}};
		System.out.println("Original Matrix: ");
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Transpose Matrix: ");
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < i; j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
