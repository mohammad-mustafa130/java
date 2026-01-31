class StringFreqMapTest {
	public static void main(String[] args) {
		String s = "Lucknow Junction";
		int[] hash = new int[123];
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == ' ') continue;
			hash[s.charAt(i)]++;
		}
		for(int i = 0; i < hash.length; i++) {
			if(hash[i] > 0) {
				System.out.println("Char: "+ (char)i+" Frequency: "+hash[i]);
			}
		}
	}
}
