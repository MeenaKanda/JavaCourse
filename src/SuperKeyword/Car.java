package SuperKeyword;

public class Car {
	
	//this() => is used to call same class constructor.
	//super() => keyword is used to call parent class constructor(default or parameterized cons)
	//super keyword must be first statement.
	//2 super keyword can not be used in the same constructor.
	//super and this keyword can not be used together in the constructor.
	//super=> keyword is used to call parent class variable when both parent and child class having same variable name
	//super=> keyword is used to call parent class method when both parent and child class having same method name(overridden method)

	String name;
	int price;
	
	int min_speed =100;
	
	
	public void display() {
		System.out.println("Car -- display");
		
	}

	public Car(String name, int price) {
		System.out.println(name + " "  + price);
		this.name = name;
		this.price = price;
	}

	public Car() {
		System.out.println("Car const");
	}
}
 
