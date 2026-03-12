package mypkg;
class EmpTester {
	public static void main(String... args) {
		Employee e = new Employee();
		Class c1 = e.getClass();
		//System.out.println(c.getName());
		Class c2 = null;
		try {
			c2 = Class.forName("mypkg.Employee");
			//System.out.println(c.getName());
		} catch(ClassNotFoundException cnf) { }

		Class c3 = Employee.class;
		//System.out.println(c.getName());

		/*try {
			Class c = Employee.class;
			Employee e = (Employee)c.getConstructor().newInstance();
			e.display();
		} catch(Exception e) { 
			e.printStackTrace();
		}*/
		if(c1 == c3) {
			System.out.println("True");
		}
		if(c1 == c2) {
			System.out.println("True");
		}
		if(c2 == c3) {
			System.out.println("True");
		}
	}
}
