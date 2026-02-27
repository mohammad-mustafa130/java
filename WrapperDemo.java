class WrapperDemo {
	public static void main(String[] args) {
		int x = 10;
		//Integer it = new Integer(x);
		//Integer it = new Integer(10);
		Integer it = new Integer("10");
		int y = it.intValue();
		System.out.println(y);
	}
}
