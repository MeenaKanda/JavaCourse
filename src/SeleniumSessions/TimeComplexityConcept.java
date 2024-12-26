package SeleniumSessions;

public class TimeComplexityConcept {

	public static void main(String[] args) {
		
		
		//  time complexity O(1)
		int i = 1;
		System.out.println(i);
		
		//O(1)
		String s = "hello";
		System.out.println(s);
		
		//O(1)
		int a = 10;
		int b = 20;
		int c =a+b;
		System.out.println(c);
		
		
		// 2 mins: 120 secs
		for(int p = 1; p<=100; p++) {
			System.out.println(p);
		}
		
		//O(n)
		//1+n+n+n => 1 + 3n => 3n +1 -- linear equation
		//3n + 1 => 3n => O(n)
		
		
		//O(n^2)
		for(int v = 1; v<=10; v++) {
			for(int u = 1; u<=10; u++) {
				System.out.println("hi");
			}
		}
		
		//(1+n+n)(1+n+n+n) 
		//(1+2n)(1+3n) => 1+3n+2n+6n^2 => Quadretic equation
		//6n^2 + 5n + 1 ==> 6n^2 + 5n==> n(6n+5) ==> n(6n)==>O(n^2)
		
		
		//both for loop are separate not inside other
		for(int p = 1; p<=10000000; p++) {
			System.out.println(p);
		}//running n no of times=> n
		for(int p = 1; p<=10000000; p++) {
			System.out.println(p);
		} ////running n no of times=> n
		//n+n => 2n==> O(n)
		
		//time complexity O(n^3)
		for(int v = 1; v<=10; v++) {
			for(int u = 1; u<=10; u++) {
				for(int l = 1; l<=10; l++) {
					System.out.println("hi");
				}
			}
		}
		//(1+n+n)(1+n+n)(1+n+n+n) ==> O(n^3)
		
	}
	
}
