package OOP_AbstractClasses;

public class LoginPage extends Page {

	public LoginPage () {
        // this keyword call 
		System.out.println("LP -- const...");
	}
	
	public LoginPage (int i) {
//		super(30);  //this super keyword is used to call parent class default cons
		System.out.println("LP -- const..." + i);
	}
	
	@Override
	public void title() {
		System.out.println("LP - title");	
	}

	@Override
	public void url() {
		System.out.println("LP - url");	
	}
	
	public void reserPwd() {
		System.out.println("LP - reset PWD");
	}
	
	@Override
	public void pageLoadingTime() {
		System.out.println("Page loading time 5 secs");
	}
	
	//method hiding: it is not Object Oriented
	public static void pageCycle() {
		System.out.println("LoginPage Cycle");
	}

	
	@Override
	public void privacyPolicy() {
		System.out.println("LP - Privacy Policy");
		
	}

}
