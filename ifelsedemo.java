class ifelsedemo {
	public static void main(String[] args) {
		int x = 10, y = 20, z = 30;
		if(x < y) if(y > z) if(z < x) System.out.println("a");
		else System.out.println("b");
		else System.out.println("c");
		else System.out.println("d all conditon are false");
	}
}
