package SeleniumSessions;

public class MathOpeations {

	public static void main(String[] args) {
		// In division both are integer result-> int
		// any of them or both float result -> float
		System.out.println(10/2); //5
		System.out.println(9/2);  //4.5-> 4
		System.out.println(25/4.0); //6.25
		System.out.println(25.0/4); //6.25
		System.out.println(25.0/4.0); //6.25
		
		System.out.println(9.0/2); //4.5
		System.out.println(9/2.0); //4.5
		System.out.println(9.0/2.0); //4.5
		
		//System.out.println(9/0); //ArithmeticException(AE)
		//AE applicable for only integer. 0 is also pure integer.
		System.out.println(0/9); //0
		System.out.println(0/1); //0
		
		//in case of float it give Infinity
		System.out.println(9/0.0); //Infinity //0.0 is not an integer
		System.out.println(9.0/0); //Infinity
		System.out.println(9.0/0.0); //Infinity
		//System.out.println(0/0);    //AE
		System.out.println(0.0/0.0); //NaN
		System.out.println(0.0/0);  //NaN
		System.out.println(0/0.0);  //NaN
		
		System.out.println(100/0.0); //Infinity
		
		
		System.out.println(10 % 2);  //0 //reminder
		System.out.println(9 % 2);  //1
		
		System.out.println(9.2 % 2); //1.1999999999999993
		
	}

}
