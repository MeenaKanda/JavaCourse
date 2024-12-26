package ExceptionHandling;

public class DriverFactory {

	public static void main(String[] args) {

		// String browser = "chrome";
		String browser = null;

		if ((browser == null)) {
			try {
				throw new Exception("browser not found"); 
				// throw new RuntimeException("browser not found");
				// throw new NullPointerException("browser not found");
				// throw new ArithmeticException("browser not found"); //we can throw any kind of exception(our choice)
				

			} catch (Exception e) { // RuntimeException e //Throwable e
				System.out.println("begin catch block");
				e.printStackTrace();
				System.out.println("end catch block");
			}
		}

		System.out.println("bye");
	}

}
