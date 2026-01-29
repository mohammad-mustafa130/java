class NullPointerDemo {
	public static void main(String[] args) {
		int[][] arr = new int[5][];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = new int[]{0,0,0,0,0};
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+ " ");
			}
		}
		System.out.println();
	}
}
