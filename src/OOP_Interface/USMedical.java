package OOP_Interface;

public interface USMedical extends WHO, USHG{
	
	int min_fee = 10;
	
	//In Interface:
	//can not have the method body. it is called Abstract method
	//only method declaration - no business logic
	//only method prototype
	
	//In Java we can not create the Object of Interface.
	//because there is no method body/business logic/declaration in method.(Abstract Method) 
	//can not have const.. of the interface(Obj can not be created by interface)
	
	//Abstract Methods:
	//final - NA -> final abstract method in interface cannot have method body.no use of final method.
	//static - NA ->static method cannot be overridden. so not allowed.Abstract method should be overridden in child class.
	//private - NA -> private method requires body. but abstract method have no body. not allowed
	
	//jdk 1.7 : 100% abstraction (only have abstract methods)
	//jdk 1.8 : default non static methods: ~100%
	//if I have no abstract method - 0% abstraction
	
	//Abstract method can have return type and can have parameters.  eg: public String getTitle();  // public void get(String url)
	public void cardioServices();
	
	public void neuroServices();
	
	public void physioServices();
	
	public void emergencyServices();
	
	@Override
	public void covidVaccination();
	//fortis can override the WHO method.but no use of override in USMedical. finally class only going to implement the method. not interface(US)
	
   
	
	//After JDK 1.8:
	  //1. static method with method body allowed.
	public static void taxCalculation() {  //static method can not be overridden. but can method hiding
    	System.out.println("US- taxCalculation");
    }
	
	// In interface we can not have final method.
	//in interface we can not have private method
//	public final static void taxCalculation() {  //static method with final not allowed.
//  System.out.println("US- taxCalculation");
//    }

     // 2. default methods allowed: not static:
	 default void getMedicalServices() { 
		 System.out.println("US - getMedicalServices");
	 }
	
}



 










