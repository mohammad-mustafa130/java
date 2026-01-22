class SwitchDemo {
	public static void main(String[] args) {
		int x = 98;
		switch(x) {
			case 97: System.out.println("Case 1");
				break;
			case 'b': System.out.println("Case 2");
				break;
			case 5%2: System.out.println("Case 3");
				break;
			default: System.out.println("Default case");
		}
	}
} 
				
