package WebDriver_Arch;

public class FireFoxDriver implements WebDriver{

	public FireFoxDriver() {
		System.out.println("FireFox is launched");
	}
	
	
	@Override
	public void findElement(String element) {
		System.out.println("find element :" + element);	
	}

	@Override
	public void get(String url) {
		System.out.println("enter url : " + url);
	}

	@Override
	public String getTitle() {
		System.out.println("getting the page title");
		return "Naveen Automation Labs";
	}

	@Override
	public void click(String element) {
	   System.out.println("clicking on element: " + element);
	}

	@Override
	public void sendKeys(String element, String value) {
		System.out.println("entering value :" + value + " into " + element);
	}

	@Override
	public void close() {
		System.out.println("close browser");
	}

}
