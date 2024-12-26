package ExceptionHandling;

public class FinallyBlock {

	// finally block -> whether exception coming or not finally block always
	// executed.
	// try and finally block only without catch block allowed.but exception not
	// handled and program terminated .finally always executed.
	// try block alone not allowed.
	// finally block alone is not allowed.without try we can not use finally.
	public static void main(String[] args) {

		System.out.println("hi");

		try {
			int i = 9 / 0;
		} catch (ArithmeticException e) {
			System.out.println("AE is coming...");
			e.printStackTrace();
		} finally {
			System.out.println("finally block...");
		}

		System.out.println("bye");

		// Example purpose of finally block: practical use cases:

		// connect wtih DB - oracle - PASS
		// un, pwd, server, ip: port
		// hit the SQL - PASS
		// try{
		// get the result from DB --- FAIL--- exception//PASS
		// }
		// catch() {log }
		// finally{
		// disconnect with DB
		// }

		// System.out.println("continue shopping");
		// logout

	}

}
