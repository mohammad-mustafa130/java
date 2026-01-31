class FreqChar {
	public static void main(String[] args) {
		String s = "Lucknow Junction";
		int count = 0;
		ab:
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == ' ') continue;
			count = 0;
			for(int j = 0; j < s.length(); j++) {
				if(j < i && s.charAt(j) == s.charAt(i)) continue ab;
				if(s.charAt(i) == s.charAt(j)) count++;
			 }
			System.out.println(s.charAt(i)+" - "+count);
		}
	}
}
