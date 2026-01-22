class SwitchDemo2 {
	public static void main(String[] args) {
		int x = 0;
		switch(x) {
			case 1+5: System.out.println("Case 6");
				break;
			case 1&2: System.out.println("Case 0");
				break;
			case 5%2: System.out.println("Case 1");
				break;
			default: System.out.println("Default case");
		}
	}
} 
				
