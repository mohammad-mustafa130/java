class TwoDArray {
	public static void main(String[] args) {
		int td[][] = {{1,2,3,4,5},{10,20},{11,22,33,44},{6}};
		for(int i = 0; i < td.length; i++) {
			for(int j = 0; j < td[i].length; j++) {
				System.out.print(td[i][j]+" ");
			}
			System.out.println();
		}
	}
}
