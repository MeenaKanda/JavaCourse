package SeleniumSessions;

public class ForLoopConcepts {

	public static void main(String[] args) {

		// print 1 to 10
		for (int i = 1; i <= 10; i++) {
			System.out.println(i); // 1 2 3 4 5....10
		}
		System.out.println("---------------------------");

		// print 1 to 10
		for (int j = 1; j <= 10;) {
			System.out.println(j); // 1 2 3 4 5....10
			j++;
			// ++j;
			// j=j+1;
		}

		System.out.println("---------------------------");
		// print 1 to 10
		int k = 1;
		for (; k <= 10;) {
			System.out.println(k); // 1 2 3 4 5....10
			k++;
			// ++k;
			// k=k+1;
		}
		System.out.println("---------------------------");

		//
		// for(;;) {
		// System.out.println("Bye"); //bye print infinity time
		// }

		for (; true;) {
			System.out.println("Bye"); // bye print infinity time without using break
			break;       // break helps come out of loop
		}
		
		// for(;false;) {   // it gives error. false statement dont match for forloop
		//		 System.out.println("Bye");  
		//		}
		
		System.out.println("***********************");
	// homework
		int x = 1;
		for(; ;) {
			while(x<=50) {
			System.out.println("bye" + x);
		     x++;
			}
			break;
		}
		
		//give me an example of unreachable code?
		//this forloop generate infinity loop. never end
	/*	for(;;) {
			System.out.println("hi");
		}
		System.out.println("bye"); */ // this is unreachable code
		
		
		//print 5 to 50
		for(k = 5; k<=50; k++) {
			System.out.println(k);
			   if(k % 5 == 0) {
				   System.out.println("hiiiiii");
			   }
		}
		
		System.out.println("---------------------------");
		
		
		for(k = 5; k<=50; k++) {
			System.out.println(k);
			   if(k % 5 == 0) {
				   System.out.println("hiiiiii");  //Answer: 5 hiiiiiiii
				   break;   // this break, come out of for loop
			   }
		}
		
		System.out.println("---------------------------");
		
		//print a to z:
		for(char c = 'a'; c<='z'; c++) {
			System.out.println(c);
		}
		System.out.println("---------------------------");
    
	
	// print ASCII value of a to z: 
		for(char r = 'a'; r<='z'; r++) {
			System.out.println((int)r + " : " + r);
		}
		
	// we can use byte in forloop
		for(byte b = 1; b<=5; b++) {
			System.out.println(b);
		}
	
		System.out.println("---------------------------");
	
	// double in forloop: // float also can be used in forloop:
		for(double d = 1.1; d<=10; d++) {
			System.out.println(d); // 1.1 2.1 3.1 .....9.1
		}
		
		System.out.println("---------------------------");
		
		// String in forloop:
		//for(String s = "naveen"; s.equals("naveen"); ) { 
		//	System.out.println("hi " + s);  //infinity loop
		//}
		
		for(String s = "naveen"; s.equals("naveen"); ) { 
			System.out.println("hi " + s); //hi naveen
		    break;
		}
		
		// if condition are not satisfied(false):
		for(String s = "naveen"; s.equals("naveen1"); ) { 
			System.out.println("hi " + s); 
		}
		
		System.out.println("---------------------------");
		
				
	}
	
	
}