package OOP_Constructor;

public class LoginTest {

	public static void main(String[] args) {
		
		LoginPage lp1 = new LoginPage("admin@gmail.com", "admin123");

		lp1.doLogin();
		System.out.println("---------------");
	//	System.out.println(lp1.doLogin());
		System.out.println("---------------");
		if(lp1.doLogin()) {
			System.out.println("display the menu items");
		 
	    System.out.println("---------------");
		
		LoginPage lp2= new LoginPage("naveen@gmail.com", "naveen123");
		System.out.println(lp2.userName);  //naveen@gmail.com
		System.out.println(lp2.password);  //naveen123
		
		lp2.resetPwd();
		}
		
	}

}
