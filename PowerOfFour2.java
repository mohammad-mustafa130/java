class PowerOfFour2 {
	public static void main(String[] args) {
		int num = 16;
		if(((num & (num - 1)) == 0) && ((num % 3) == 1)){
			System.out.println("Number is in power of 4");
		} else {
			System.out.println("Number is not in power of 4");
		}
	}
} 
