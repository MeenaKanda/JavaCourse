package WebDriver_Arch;

public class NaveenAutomationAppTest {
	
//	static WebDriver driver;  //declare in class level
	
	
	public static void main(String[] args) {
		
		//topcasting with grandparent I not possible.because it have only one method. WebDriver have all methods.
//	    SearchContext sc = new ChromeDriver();
//	    sc.findElement(element);
		
		
		//chrome:
		//ChromeDriver driver = new ChromeDriver();  
		//as soon as creating obj the chrome const will be called
		
		//FireFoxDriver driver = new FireFoxDriver();
		
		//SafariDriver driver = new SafariDriver();
		//instead of commenting and uncommenting we use Top Casting.
		//adv of topcasting -> we able to achieve cross browser testing at the same time.no need to comment and uncomment.
		
		
		//cross browser logic:
		String browser = "firefox";
		WebDriver driver = null;   //local variable should be initialize with default value.
		 
		if(browser.equals("chrome")) {
			 driver = new ChromeDriver();
		}
		else if(browser.equals("firefox")) {
			 driver = new FireFoxDriver();
		}
		else if(browser.equals("Safari")) {
			 driver = new SafariDriver();
		}
		else {
			System.out.println("plz pass the right browser name....");
		}
		
			
		//if you didn't pass right browser you will get NullPointerException.
		//because driver pointing to null.if you perform any action on null you get Nullpointerexception.
			
			
		driver.get("https://www.naveenautomationlabs.com");
		String actualTitle = driver.getTitle();
		System.out.println("page title : " + actualTitle );
		if(actualTitle.equals("Naveen Automation Labs")) {
			System.out.println("title is correct");
		}
		else {
			System.out.println("in correct title");
		}
		
		driver.sendKeys("emailId", "naveen@gmail.com");
		driver.sendKeys("password", "naveen@123");
		driver.click("loginButton");
		
		driver.close();
		
	}

}
