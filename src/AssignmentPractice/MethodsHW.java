package AssignmentPractice;

public class MethodsHW {
	
	//1.Write a program to print the sum of two numbers entered by user by defining your own method.
	
	public void sumOfTwoNum(int a, int b) {
		int sum = a + b;
		System.out.println("Sum of two numbers ; " + sum);
	}
	//	2. Define a method that returns the product of two numbers entered by user.
		
		public int productOfTwoNum(int a , int b) {
			System.out.println("Product of two numbers");
			int pro = a * b;
			return pro;
			}
		
		//4. Define two methods to print the maximum and the minimum number respectively among three numbers entered by user.
	
        public void maxOfThreeNum(int a, int b, int c) {
        	if(a>b & a>c) {
        		System.out.println("a is the greatest num : " + a);
        	}
        	else if(b>a & b>c) {
        		System.out.println("b is the greatest num : " + b);
        	}
        	else {
        		System.out.println("c is the greatest num : " + c);
        	}
        }
        
        	//5. Define a program to find out whether a given number is even or odd.
        	
        	public void evenOrOdd(int a) {
        		if(a%2 == 0) {
        			System.out.println("the given num is even : " + a);
        		}
        		else {
        			System.out.println("the given num id odd : " + a);
        		}
        	}
        	
        	//6. A person is eligible to vote if his/her age is greater than or equal to 18. 
        	//Define a method to find out if he/she is eligible to vote.
        	
        	public void eliVote(int a) {
        		if(a>=18) {
        			System.out.println(a + " is eligible for vote");
        		}
        		else {
        			System.out.println(a + " is not eligible for vote");
        		}
        	}
        
		//8. Write a program which will ask the user to enter his/her marks (out of 100). 
        //Define a method that will display grades according to the marks entered as below:
		
        	public void mark(int a) {
        		if(a>90 & a<=100) {
        			System.out.println(a + " : Grade AA");
        		}
        		else if(a>80 & a<=90) {
        			System.out.println(a + " : Grade AB");
        		}
        		else if(a>70 & a<=80) {
        			System.out.println(a + " : Grade BB");
        		}
        		else if(a>60 & a<=70) {
        			System.out.println(a + " : Grade BC");
        		}
        		else if(a>50 & a<=60) {
        			System.out.println(a + " : Grade CD");
        		}
        		else if(a>40 & a<=50) {
        			System.out.println(a + " : Grade DD");
        		}
        		else {
        			System.out.println(a + " : fail");
        		}
        	}
		
		
	public static void main(String[] args) {
		
		MethodsHW m = new MethodsHW();
		m.sumOfTwoNum(22, 45);  
		System.out.println(m.productOfTwoNum(5, 20));
		m.maxOfThreeNum(250, 30, 10);
		m.evenOrOdd(0);
		m.eliVote(18);
		m.mark(31);
		
	}

}
