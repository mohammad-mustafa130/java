class PowerOfFour {
	public static void main(String[] args) {
		int num = 15;
		int count = 0;
		while( num != 0) {
			if((num & 1) == 1) {
				count++;
			}
			num = num >> 1;
		}
		if((count & 1) == 1) {
			System.out.println("Number is in power of 4");
		} else {
			System.out.println("Number is not in power of 4");
		}
	}
}
