package LamdaExpression;

import java.util.function.Predicate;

public class PredicateDemo1 {

	public static void main(String[] args) {
		
		
		//Ex:1 check given no greater than 10
		
		Predicate<Integer> p = n->(n>10);
		System.out.println(p.test(12)); //true
		System.out.println(p.test(3));  //false
		
		//Ex:2  check given string length greater than 4
		Predicate<String> pr = s->(s.length()>4);
		System.out.println(pr.test("Meenakshi"));
		System.out.println(pr.test("Samu"));
		 
		
		//Ex:3 Print an array whose size is greater than 4
		String names[] = {"Meenakshi", "Kanda", "Sam", "tim"};
		
		for(String name : names) {
			if(pr.test(name)) {          // multiple condition can be verified inside lamda expression
				System.out.println(name);
			}
	/*		
			if(name.length()>4) {   //only one condition we can write inside if()
				System.out.println(name);
			}
	*/
		}
		
		
		
 	}

}
