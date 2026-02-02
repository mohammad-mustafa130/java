class StringPatternSearch {
	public static void main(String[] args) {
		String str = "I am an Integralite from Lucknow";
		String ptr = "gral";
		boolean token = false;
		for(int i = 0; i <= (str.length()-ptr.length()); i++) {
			if((ptr.charAt(0) == str.charAt(i)) && (str.substring(i,i+ptr.length()).equals(ptr))) {
				System.out.println("Pattern found at "+i);
				token = true;
				break;
			}
		}
		if(!token) {
			System.out.println("Pattern not found");
		}
	}
}
