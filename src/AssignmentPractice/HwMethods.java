package AssignmentPractice;

public class HwMethods {
	
  //   1.Write a program to print the sum of two numbers entered by user by defining your own method
	public int sumOfTwoNumbers(int a, int b) {
		System.out.println("sum of two numbers");
		 int sum = a + b;
		 return sum;
	}
	
	//	 2. Define a method that returns the product of two numbers entered by user
		public int productOfTwoNum(int x, int y) {
			System.out.println("product of two numbers");
		    int product = x*y;
		    return product;
		}

	//	4. Define two methods to print the maximum and the minimum number respectively among three numbers entered by user. 
		 
	//	9. Write a program to print the factorial of a number by defining a method named 'Factorial'.
    //	Factorial of any number n is represente﻿d by n! and is equal to 1*2*3*....*(n-1)*n. 	 
	
		static int factorial(int n) {
			if(n==0) {
				return 1;}
			else {
				return (n * factorial(n-1));
			}
			
			
			
		}

	public static void main(String[] args) {
	//	1.Write a program to print the sum of two numbers entered by user by defining your own method

		HwMethods s = new HwMethods();
		int total = s.sumOfTwoNumbers(22, 44);
		System.out.println(total);
	
	    System.out.println("-----------------");
	    int pro =  s.productOfTwoNum(10, 44);
	    System.out.println(pro);
	
	    System.out.println("-----------------");
//		4. Define two methods to print the maximum and the minimum number respectively among three numbers entered by user. 
		 
	    int c = 10;
	    int d = 500; 
	    int e = 4000;
	    
	    if(c>d & c>e) {
	    	System.out.println("c is the biggest of three num:  " + c);
	    }
	    else if(d>c & d>e) {
	    	System.out.println("d is the biggest of three num:  " + d);
	    }
	    else {
	    	System.out.println("e is the biggest of three num:  " + e);
	    }
	    
	    System.out.println("---------OR--------");
	    
	    if(c>d) {
	    	if(c>e) {
	    		System.out.println("c is the greatest of three num: " + c);
	    	}
	    	else {
	    		System.out.println("e is the greatest of three num: " + e);
	    	}
	    }
	    else if(d>c) {
	    	if(d>e) {
	    		System.out.println("d is the greatest of three num: " + d);
	    	}
	    	else {
	    		System.out.println("e is the greatest of three num: " + e);
	    	}
	    }
	    
	    System.out.println("-----------------");
	    
	//    5. Def﻿ine a program to find out whether a given number is even or odd.
	    
	    int z = 256;
	    if(z%2 == 0) {
	    	System.out.println("given number is even: " + z);
	    }
	    else {
	    	System.out.println("given number is odd: " + z);
	    }
	    
	    System.out.println("-----------------");
	  //  6. A person is elligible to vote if his/her age is greater than or equal to 18.
      //  Define a method to find out if he/she is elligible to﻿ vote.
	    
	    int age = 20 ;
	    if(age>=18) {
	    	System.out.println("eligible for vote: " + age);
	    }
	    else{
	    	System.out.println("not eligible for vote: " + age);
	    }
	    
	    
	    //7.Define a method to find out if number ﻿is prime or not.
	    
	    System.out.println("--------------------");
	   //9.
	
	    
	    int fact = factorial(5);
	    System.out.println(fact);
	    
	    System.out.println("***************");
	    //9.
	    int fac = 5 ;
	    
	    for(int i = fac-1; i>=1; i--) {
	    	fac = fac*i;
	    }
	    
	    System.out.println(fac);
	}

}
