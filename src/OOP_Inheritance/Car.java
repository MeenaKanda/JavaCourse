package OOP_Inheritance;

public class Car extends Vehicle {
	
	//final:
	//1. constant value
	//2. to prevent method overriding EX: in web application, in page class-> display logo method make it final.so no one can override. so logo will be same in all page(reg,login,home)
	//3. to prevent inheritance. if class with final keyword, it can not be extended by other class.
	
	//for static method-> overriding is not possible.but overload is possible
	
	//multilevel inheritance are allowed.
	//multiple inheritance are not allowed. (BMW extends Car, Vehicle). can not have multiple class as a parent. it is called Diamond problem

	public void start() {
		System.out.println("Car---start");
	}
	
	public void stop() {
		System.out.println("Car---stop");
	}
	
	public void refuel() {
		System.out.println("Car---refuel");
	}
	
	public static void billing() {
		System.out.println("Car---billing");
	}
	
	public static final void display() {
		System.out.println("Car--display");
	}
	
	public final void running() {
		System.out.println("Car--running");
	}
	
	
	public void payment(String  cc, int cvv) { 
		System.out.println("Car payment using : " + cc + " ; " + cvv);
	}
	
	public void payment(String upi) {
		System.out.println("Car payment using : " + upi);
	}
	
	@Override 
	public void engine() {
		System.out.println("Car---engine");
	}

}
