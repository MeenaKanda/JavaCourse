package OOP_Inheritance;

public class TestCar {

	public static void main(String[] args) {
		
		BMW b = new BMW();
		b.start();  
		b.stop();    
		b.refuel();  		
		b.autoParking(); 
		
		
		BMW.billing(); 
		Car.billing(); 
		
//		BMW.billing(); //Car billing //if BMW not overridden static method
		
		BMW.display(); 
		
		b.running();  
		
		b.payment("meena@2767");  
		
		b.engine();  
		
		System.out.println("-------Audi---------");
		Audi au = new Audi();
		au.theftSafety();
		au.start();
		au.stop();
		
		System.out.println("----------------");
		
		Car c = new Car();  
		c.start();
		c.stop();
		c.refuel();
	  //c.autoparking();  //parent class cannot access the BMW individual methods

		c.payment("meena@1777689");
		
		c.engine(); 
		
		System.out.println("----------------");
		
		
		//child class object can be referred by parent class ref variable
		//Top/Up Casting
		Car c1 = new BMW();   
		               
		
		c1.start();  
		c1.stop();    
		c1.refuel();  
		c1.petrolEngine();
//		c1.autoParking();   //not allowed because autoparking is individual methods(nothing related to Car). so it cannot be accessed by Car class ref vars.
	    c1.engine();
	    c1.payment("meena1234");
	    c1.payment("kanda123", 120);
	    c1.running();
	 
	    //down casting:
		//parent class object can be referred by child class ref variable
	//	BMW b1 = new Car();   //every Car is a BMW? No
		
	//	BMW b1 =(BMW) new Car(); //ClassCastException at run time. not compile time error(fooling the compiler at compile time)
		//creating car Object and converting into a BMW Object  
	    //painting(decorate)Car like BME at compile time But while running it shows exception 
	
	
		System.out.println("----------------");
	
		//child class object can be referred by grand parent class ref variable
	    //v-> can access only overridden and methods available in grand parent class(Vehicle).can not access methods from parent class(Car)
		//Top/Up Casting
		Vehicle v = new BMW();
		v.petrolEngine();  
		v.engine();    
		
		 
	
	    //down casting:
			//parent class object can be referred by child class ref variable
		//	BMW b2 = new Vehicle();   //every Car is a Vehicle? No
	
//	    BMW b2 =(BMW) new Vehicle();  //classCastException
		
	}

}
