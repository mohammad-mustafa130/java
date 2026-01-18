class PowerOfTwo {
	public static void main(String[] args) {
		int num = 16;
		if((num & (num - 1)) == 0) {
			System.out.println("Number is in power of 2");
		} else {
			System.out.println("Number is not in  power of 2");
		}
	}
}
