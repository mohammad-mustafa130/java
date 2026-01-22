class StarPattern {
	public static void main(String[] args) {
		for(int j = 1; j <= 5; j++) {
			System.out.print("* ");
		}
		System.out.println();
		for(int i = 2; i <= 4; i++) {
			for(int j = 1; j <= 4; j++) {
				if(j != 1) System.out.print("  ");
				else System.out.print("* ");
			}
			System.out.println("* ");
		}
		for(int j = 1; j <=5; j++) {
			System.out.print("* ");
		}
		System.out.println();
	}
}
