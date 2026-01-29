class MultiplicationOfMatrix {
	public static void main(String[] args) {
		int a[][] = {{1,2,3,4},{5,6,7,8},{9,1,2,3}};
		int b[][] = {{5,6,7},{9,1,2},{4,5,6},{7,8,9}};
		int c[][] = new int[3][3];

		System.out.println("Matrix1: ");
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}

		System.out.println("Matrix2: ");
		for(int i = 0; i < b.length; i++) {
			for(int j = 0; j < b[i].length; j++) {
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		for(int i = 0; i < c.length; i++) {
			for(int j = 0; j < c[i].length; j++) {
				c[i][j] = 0;
				for(int k = 0; k < b.length; k++) {
					c[i][j] += a[i][k] * b[k][j];
				}
			}
		}

		System.out.println("Matrix after multiplication:");
		for(int i = 0; i < c.length; i++) {
			for(int j = 0; j < c[i].length; j++) {
				System.out.print(c[i][j]+ " ");
			}
			System.out.println();
		}
	}
}
