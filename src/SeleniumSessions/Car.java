package SeleniumSessions;

public class Car {
	
	
	String name;
	int price;
	String color;
	static final int wheels = 4;  // but with final keyword variable should have value.  
	static  int steering;    // it is not mandatory to assign value for static variable at the beginning.
	
	static int i = 50;
	
	public void start() {
		System.out.println("Car--start");
	}
	
	public static void speedTest() {
		System.out.println("Car--speedTest");
	}

	public static void main(String[] args) {
		
		final int i = 10;
		
		final int days = 7; 
		//days = 10;
		System.out.println(days * 100);
		
		Car c1 = new Car();
		c1.name = "BMW";
		c1.price = 90;
		c1.color = "Red";
	//	c1.wheels = 4;  
		
		Car c2 = new Car();
		c2.name = "Audi";
		c2.price = 98;
		c2.color = "white";
	//	c2.wheels = 4;
		
		Car c3 = new Car();
		c3.name = "Honda";
		c3.price = 20;
		c3.color = "Black";
	//	c3.wheels = 4;
				
		//how to access/assign static variables:
		//1. direct calling:
		System.out.println(wheels);
		System.out.println(c1.name + " " + c1.price + " " + c1.color + " " + wheels);

		//2. by using class name: 
		System.out.println(Car.wheels);
		System.out.println(c1.name + " " + c1.price + " " + c1.color + " " +Car.wheels);

		//how to call static methods:
		//no need to use the object
		//1. direct calling:
		speedTest();
		c1.start();   
		
		//2. by using class name:
		Car.speedTest();
		
		
		//static stuff can be accessed by obj ref name with warning:
		c1.speedTest();  
		//you can call static method by using object, but it give you warning
		//The static method speedTest() from the type Car should be accessed in a static way.
		//because static method speedTest() available in CMA. not inside object
		System.out.println(c1.wheels);
	
		//Car.wheels = 5; //we can not assign/change the value of static variable when we use final keyword.
		
		Car.steering = 1;
		System.out.println(Car.steering);
		
		System.out.println(Application.i);  //Application different class
		System.out.println(Car.i);
	}

}
