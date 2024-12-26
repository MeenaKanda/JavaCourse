package AccessModifier1;

public class Cycle {

	public static void main(String[] args) {
	
		Car c = new Car();
		c.name = "Bicycle";
		c.color ="blue";
		c.seller = "Honda";
//		c.price            //private can not be accessed by another class in same package
		

		c.publicMethod();
		c.protectedMethod();
		c.defaultMethod();
//		c.privateMethod();   //can not access  
	}

}
