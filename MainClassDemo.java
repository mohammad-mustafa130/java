class MainClassDemo {
	public static void main(String[] args) {
		int[] arr = {2,5,7,10,15,25,70,80};
	
		SearchingAlgos sa = Factory.getInstance();

		int result = sa.search(arr,25);
		if(result == -1) {
			System.out.println("Not found");
		} else {
			System.out.println("Found at: "+result);
		}
	}
} 
