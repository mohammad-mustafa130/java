class DiagonalSum2 {
	public static void main(String[] args) {
		int arr[][] = {{2,4,6,8},{1,3,5,7},{10,20,30,40},{11,22,33,44}};
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i][arr.length-1-i];
		}
		System.out.println(sum);
	}
}
