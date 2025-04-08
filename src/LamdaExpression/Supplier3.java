package LamdaExpression;

import java.util.Date;
import java.util.function.Supplier;

public class Supplier3 {
	
	//Supplier will not take any input argument. it will take return type argument only

	public static void main(String[] args) {
		
		Supplier<Date> d = ()-> new Date();
		System.out.println(d.get());  //Tue Apr 08 11:08:58 PDT 2025
	}

}
