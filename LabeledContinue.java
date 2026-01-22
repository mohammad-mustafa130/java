class LabeledContinue {
	public static void main(String[] args) {
		ab:
		for(int i = 0; i < 5; i++) {
			for(int j = 0;  j < 5; j++) {
				if(i == 2) continue ab;
				System.out.println(i + " " + j);
			}
		}
	}
}
