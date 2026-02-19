interface MyInterface {
	void display();
}
class MyClass {
	void myMethod(MyInterface mi) {
		mi.display();
	}
}

