package LamdaExpression;

import java.util.function.Predicate;

public class JoiningPredicates {
	
	//Joining Predicates -> and , or, negate
	//p1 -- checks number is even
	//p2 -- checks greater than 50

	public static void main(String[] args) {
		
        int a[] = {5,10,15,20,25,30,35,40,45,50,55,60,65};
        
        Predicate<Integer> p1 = i->i%2==0;
        
        Predicate<Integer> p2 = i->i>50;
        
      
        //and
        System.out.println("Following numbers are EVEN and Greater than 50 .......");
        
        for(int n:a) {
        //	if(p1.test(n) && p2.test(n)) {
        	if(p1.and(p2).test(n)) {
        		System.out.println(n);
        	}
        }
        
        
        //or
        System.out.println("Following numbers are EVEN or Greater than 50 .......");

        for(int n:a) {
            //	if(p1.test(n) || p2.test(n)) {
            	if(p1.or(p2).test(n)) {
            		System.out.println(n);
            	}
            }
        
        System.out.println("Negate numbers ..............");
        
        //negate
        for(int n:a) {
            	if(p1.negate().test(n)) {
            		System.out.println(n);
            	}
            }
        
	}

}
 