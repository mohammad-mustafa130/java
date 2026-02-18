class BeanDemo {
	private int age;
	private String name;
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}

	public static void main(String[] args) {
		BeanDemo bd = new BeanDemo();
		bd.setAge(30);
		bd.setName("Mukesh Kumar");

		System.out.println(bd.getAge());
		System.out.println(bd.getName());
	}
}
