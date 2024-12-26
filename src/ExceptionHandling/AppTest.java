package ExceptionHandling;

public class AppTest {

	public static void main(String[] args) {

		String data = null;

		if (data == null) {
//			try {
			throw new ApplicationException("DATANOTFOUNDEXCEPTION");
//			}
//			catch(Exception e) {
//				System.out.println("catch block");
//				e.printStackTrace();
//			}
//			finally {
//				System.out.println("finally block");
//			}
		}

		System.out.println("bye AppTest");
	}

}
