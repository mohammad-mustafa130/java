package mypkg;
class EmpTester {
	public static void main(String... args) {
		/*Employee e = new Employee();
		Class c = e.getClass();
		System.out.println(c.getName());*/

		/*try {
			Class c = Class.forName("mypkg.Employee");
			System.out.println(c.getName());
		} catch(ClassNotFoundException cnf) { }*/

		/*Class c = Employee.class;
		System.out.println(c.getName());*/

		try {
			Class c = Employee.class;
			Employee e = (Employee)c.getConstructor().newInstance();
			e.display();
		} catch(Exception e) { 
			e.printStackTrace();
		}
	}
}
