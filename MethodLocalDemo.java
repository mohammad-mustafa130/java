class MethodLocalDemo {
	int age = 20;
	public void caller() {
		class LocalDemo {
			String name = "Ajay Singh";
			public void display() {
				System.out.println(name);
				System.out.println(age);
			}
		}
		LocalDemo ld = new LocalDemo();
		ld.display();
	}
}

