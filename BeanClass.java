class BeanClass {
	private BeanClass() { }
	int i = 0;
	private static BeanClass b = null;
	public static BeanClass getInstance() {
		if(b == null) b =  new BeanClass();
		return b;
	}
	public void display() {
		System.out.println(i);
		i++;
	}
}
