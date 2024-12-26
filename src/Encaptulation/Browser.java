package Encaptulation;

public class Browser {

	public void launchBrowser() { // encapsuation method to method 
		//private methods are encapsulated in public method
								
		checkRAM();
		checkVersion();
		checkOS();
		checkBrowserServices();
	}

	private void checkRAM() {
		System.out.println("checkRAM");
	}

	private void checkVersion() {
		System.out.println("checkVersion");
	}

	private void checkOS() {
		System.out.println("checkOS");
	}

	private void checkBrowserServices() {
		System.out.println("checkBrowserServices");
	}

}
