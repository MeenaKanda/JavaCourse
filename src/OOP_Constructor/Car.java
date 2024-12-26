package OOP_Constructor;

public class Car {
	
	//constructor used to create data for my class variable for specific object
	//constructor should not hold business logic.
	//method only hold the business logic
	//features of the car should be defined in the form of methods.
	//constructor used to create an object.
	//cont..is restricting the user to create the unnecessary obj of particular class.if user want to create obj, have to supply data.
	//without creating constructor => anyone can create so many objects. creating const help to restrict the obj created unnecessarily by user.(user have to supply data)
	//constuctor define what kind of obj i want to create
	
	String name;
	String color;
	int price;
	boolean isAutomatic;
	
	public double getCarMilage() { 
		double a = 12.33;
		double b = 23.44;
		double mg = a + b;
		return mg;
	}
	
	public Car(String name, String color) { 
		this.name = name;
		this.color = color;
		
	//	int x = 10;  //applicable for this constructor only
	//	this.price = x;
	}

	public Car(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public Car(String name, int price, boolean isAutomatic) {
		this.name = name;
		this.price = price;
		this.isAutomatic = isAutomatic;
	}

	public Car(String name, String color, int price, boolean isAutomatic) {
		this.name = name;
		this.color = color;
		this.price = price;
		this.isAutomatic = isAutomatic;
	}
	
	

}
