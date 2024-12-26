package AccessModifier1;

//default keyword -> used in interface only
public class Car {

	public String name;
	private int price;  
	protected String color;
	String seller; 

	public void publicMethod() {
		System.out.println("public Method");
	}

	protected void protectedMethod() {
		System.out.println("protected method");
	}

	void defaultMethod() {
		System.out.println("defaultMethod");
	}

	private void privateMethod() {
		System.out.println("private Method");
	}

	public static void main(String[] args) {
		
	//	public int i = 10;  //for local variable public private default not allowed
		final int i = 20;   //final allowed for local variable.

		Car c = new Car();
		c.price = 100;
        
	    c.publicMethod();
	    c.protectedMethod();
	    c.defaultMethod();
	    c.privateMethod();
	
	}

}
