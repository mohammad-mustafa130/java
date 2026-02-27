class Outer2 {
	private String name = "Amit Singh";
	MInterface mi = new MInterface() {
		public void display() {
			System.out.println(name);
		}
	};
}
