package SeleniumSessions;

public class StringConcatenation {

	public static void main(String[] args) {
		//String is not a keyword.
		// String -> non-primitive data types
		//String-> built in class available in java(JDK)
		//String concatenate with other data types
		String x = "hello";
		String y = "world";
		
		int a = 100;
		int b = 200;
		
		System.out.println(x);
		System.out.println(y);
		
		System.out.println(x+y);
		System.out.println(a+b);
		
		System.out.println(x+a); //concat 
		System.out.println(a+b+x+y); //300helloworld
		System.out.println(x+y+a+b); //helloworl100200
		
		System.out.println(x+y+(a+b)); //helloworld300
		
		System.out.println(a+b+x+y+a+b); //300helloworld100200
		
		double d1 = 12.33;
		double d2 = 23.44;
		System.out.println(d1+d2); //35.77
		System.out.println(x+y+d1+d2); //helloworld12.3323.44
		
		System.out.println("the value of a : " + a); //concat (string+int) the value of a : 100
		System.out.println("the value of b : " + b); //the value of b : 200
		System.out.println("the sum is : " + (a+b)); //the sum is : 300
		
		
		String ph = "9898998378";
		String ssn = "89798767989080";
		
		String ac = "98";
		int pp = Integer.parseInt(ac) + 1; //convert string to integer
		System.out.println(pp); //99

	}

}
