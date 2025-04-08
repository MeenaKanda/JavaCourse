package LamdaExpression;

import java.util.function.Function;

public class functionChaining {
	/*
	Function chaining:: has 2 method available
	using these 2 methods we can achieve function chaining
	1. addThen()
	2. compose()
*/
	
	public static void main(String[] args) {
		
		Function<Integer, Integer> f1 = n->n*2;
		Function<Integer, Integer> f2 = n->n*n*n;
		
		//andThen()
		System.out.println(f1.andThen(f2).apply(2));  //2*2   4*4*4=64
		//value of f1 will be given to f2
	 
		
		//compose
		System.out.println(f1.compose(f2).apply(2));  //2*2*2   8*2 = 16
		//value of f2 will be calculated first then given the value to f1.
		
        
	
	}
	
	
	
	
	
	

}
