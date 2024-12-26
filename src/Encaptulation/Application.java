package Encaptulation;

public class Application {

	String name;

	public void m1() { // m1 calling m2

		// call static method from non static method:
		// no need to create object for calling static method
		// t1(); // stack overflow happen . infinity time
		// we can create the object in any method(not only in main method)
		t2();

		System.out.println("m1 method");
		name = "Naveen"; // global variable. not local variable
		System.out.println(name);
		m2();
	}

	public void m2() { // m2 calling m3
		System.out.println("m2 method");
		m3();
	}

	public void m3() {
		System.out.println("m3 method");

	}

	public static void t1() {
		// calling non static method from static method
		Application a1 = new Application(); // we can create the object in any method(not only in main method)
		a1.m1();

		System.out.println("t1 method");
		t2();
	}

	public static void t2() {
		t3();
		System.out.println("t2 method");
	}

	public static void t3() {
		System.out.println("t3 method");
	}

	public static void main(String[] args) {

		Application app = new Application();
		app.m1(); // main method take reference app and call m1()
		// main method is available CMA so main method need obj to call m1() by using
		// ref app
		System.out.println(app.name);

		Application.t1();

	}

}
