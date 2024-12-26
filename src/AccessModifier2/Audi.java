package AccessModifier2;

import AccessModifier1.Car;

public class Audi extends Car{

	public static void main(String[] args) {
		
		Audi a = new Audi();
		a.name = "Audi";
		a.color = "white";
	//	a.price     //private cannot be accessed 
    //  a.seller    //default cannot be accessed
		
		//private and defalut -> property can not be accessed by child class from different package
		
		a.publicMethod();
		a.protectedMethod();
//		a.defaultMethod();
//		a.privateMethod();
	}

}
