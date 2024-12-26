package ExceptionHandling;

//Throws keyword -> used to declare the exceptions.can declare multiple exceptions.
//Throws keyword -> pass the exception from one method to another method.
//Throws is not handling the exception just passing the exception .
//actual exception are handled by try catch block only.
//JVM will not handle the exceptions,if the exception is not addressed/handled.
//throws keyword written after method name


public class ThrowsKeyword {

	public void m1() {
		System.out.println("m1 method");
		m2();
	}

	public void m2() {
		System.out.println("m2 method");
		try {
			m3();
//		System.out.println("NAVEEEEEEEEEEEEN"); //never executed because after getting exception in m3() (line21) it jump to catch block
		} catch (ArithmeticException e) {
			System.out.println("AE is coming...");
			e.printStackTrace(); // we will get to know the reason of exception // not mandatory
		} finally {
			System.out.println("finally bye...");
			try {
				int p = 9 / 0;
			} catch (ArithmeticException e) {
				System.out.println("bye 2022");
				e.printStackTrace();
			}
		}
	}

	public void m3() throws ArithmeticException {
		System.out.println("m3 method");
		int a = 10;
		int b = 0;
		int c = a / b;
		// System.out.println("m3 after exception line..."); line after exception never get executed
		
	}

	public static void main(String[] args) {

		ThrowsKeyword obj = new ThrowsKeyword();
		obj.m1();
		System.out.println("bye");
	}

}
