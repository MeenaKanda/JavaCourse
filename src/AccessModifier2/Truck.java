package AccessModifier2;

import AccessModifier1.Car;

public class Truck {
     
	
	public static void main(String[] args) {
		
		Car c = new Car();
		
		c.name = "Honds";
//		c.price
//      c.seller
//		c.color

		//private , default, protected -> property can not be accessed by non subclass from different package
		
		c.publicMethod();
//		a.protectedMethod();
//		a.defaultMethod();
//		a.privateMethod();
		
	}

}
