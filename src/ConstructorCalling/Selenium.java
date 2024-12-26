package ConstructorCalling;

public class Selenium implements Google{
	
	@Override
	public void search() {
		System.out.println("selenium search");
//		super.count;  // interface variable is static and final.count we must call in a static way . so super keyword can not be used in interface
	    System.out.println(Google.count);
	}

}
