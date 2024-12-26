package SuperKeyword;

public class BMW extends Car {

	private int min_speed = 200;

	public void speedCal() {
		System.out.println(min_speed); // BMW
		int carSpeed = super.min_speed; // CAR //super keyword used to access the parent class variable 
		int diff = min_speed - carSpeed;
		System.out.println(diff);
	}

	@Override
	public void display() {
		System.out.println("BMW -- display");
		super.display(); // this super keyword can be in any line of statement.
	}

	/*
	 * public BMW() { super(); //BMW calling default super class constructor //no
	 * need to create Car object to call Car class.
	 * System.out.println("BMW const...."); }
	 */

	public BMW() {
		super("BMW X1", 90);
		System.out.println("BMW const....");
//		super("BMW X1" , 90);   //super keyword must be first statement //wrong 
	}

	public BMW(int price) { // we can not use super and this keyword together in the same constructor.
		super("Audi ", 80);
//		this();                  
		System.out.println("BMw cons");
	}

}
