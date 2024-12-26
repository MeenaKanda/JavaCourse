package ExceptionHandling;

public class Employee {
	String name;

    //  Exception-> unwanted line of code/lines of code which is giving you an exception and
	// because of that the program getting terminated.if you write 1000 lines of
	// code after exception, it never be executed.
	// in order to execute remaining program we have to handle those exception which
	// is called exception handling using try catch.

	// types of exception:
	// 1.unchecked exception: compiler can not identified during compilation time.
	// identified during runtime only.all runtime exceptions are unchecked
	// exception.
	// EX:AE.NPE,IO:AIOB,SIOB
	// 2.checked exception: compiler can identify during runtime itself.
	// ex: interrupted exception(Thread.sleep:red line comes),
	// IO:file not found,interruptedIO,EOFE Exception
	// SQL exception

	// try -> we can not write try alone without catch block(it gives error).
    // catch block always associated with try block.
	public static void main(String[] args) {

		System.out.println("A");
		System.out.println("A");
		System.out.println("A");

		try {
			Employee obj = new Employee();
			obj = null;
			obj.name = "Naveen"; // NPE

			int i = 9 / 0; // AE
			System.out.println("hello"); // after the exception line whatever you write it never be executed.
		}

//		System.out.println("after try catch block");  //we can not write any statement right after try block .it give error in catch block.

//		catch(Exception e){   
//			e.printStackTrace();  
//		}

		catch (NullPointerException e) { 
			System.out.println("NPE is coming....");
			e.printStackTrace(); 
		}

		catch (ArithmeticException e) {
			System.out.println("AE is coming....");
			e.printStackTrace();
		}
		System.out.println("Bye");

	}

}
