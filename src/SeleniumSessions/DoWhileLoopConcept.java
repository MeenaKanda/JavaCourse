package SeleniumSessions;

public class DoWhileLoopConcept {

	public static void main(String[] args) {

		int p = 1;

//		do {
//			System.out.println(p);  //infinite for loop

//		} while (p<=10);


//		do {
//			System.out.println(p); //1 2 3 4 5 6 7 8 9 10
//			p++;
//		} while (p<=10);

//		do {
//			p++;
//			System.out.println(p); // 2 3 4 5 6 7 8 9 10 11
//		} while (p<=10);

//		do {
//			p++;
//			System.out.println(p); //2 4 6 8 10
//			p++;
//		} while (p<=10);

//	do {
//		System.out.println(p); //1  //statement e
//		p++;
//	} while (p>=10);  //condition is not satisfied.no generating loop	

/*		do { 
            System.out.println(p);   // 1 2 3 4 5 6 7 8 9 10
            if(p == 10) {
            	break;
            }
            p++;
		} while (p<=50);*/
		
		
		do { 
            System.out.println(p);   // 1 2 3 4 5 6 7 8 9 10
            if(p % 5 == 0) {
            	System.out.println("hi");
            	//break;
            	 }
            p++;
		} while (p<=50);
		
		//use cases:
		//launch a page: element : 0, 5, 10, 20 ...n seconds
		//if the element is immediately available(0 sec).
	    //if elements is not available immediately(0 sec) then it will enter into loop
/*		do {
			//element is present : yes
			//click on the element
		} while (cond);*/
		
		
/*	do {
			System.out.println("hello");  //it generate infinite loop
		} while (true);*/
		
		
		do {
			System.out.println("hello");  // hello 
		} while (false);    // false--> so dont enter into whileloop since condition is false 
		
	}

}
