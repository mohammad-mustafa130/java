class BeanTester {
	public static void main(String[] args) {
		BeanClass b1 = BeanClass.getInstance();
		b1.display();
		BeanClass b2 = BeanClass.getInstance();
		b2.display();
	}
}
