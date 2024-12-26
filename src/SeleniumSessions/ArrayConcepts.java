package SeleniumSessions;

import java.util.Arrays;

public class ArrayConcepts {
        //Array: Collections of similar kind of elements
	public static void main(String[] args) {
		
		//Array: static array: size is fixed
		//collection of elements with same type
		//Arrays--> Non primitive data type
		//range is pre-definded. within the range we can fetch the value. out of the range it give AIOB
		
		//Limitation of array:
		//1. size is fixed: static array: to overcome this we have to use dynamic array(ArrayList)
		//2. only similar type of data can be stored: to overcome this issue, we can use Object static Array
		
//		li = 0
//		len = 4;		
//      hi = len - 1
//      len = hi + 1
		
		
		int i[] = new int[4]; 
      //  int []i = new int[4];
		//inside memory 4 segments/memory allocation are created.int=4bytes. so total size of array=4*4=16
		//lowest index of array = 0 
		//hignest index of array =  n-1
		//length of an array = n
		//length of an array = hig inx + 1
		//in array memory stored in a continuous memory allocation. not random memory allocation.it is better optimizations
		
		System.out.println(i.length); //4  
		int len = i.length;
		int hi = len - 1;
		int li = 0;
		
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
//		i[4] = 50; // it is out of size of array // in this line itself it started to give AIOB exceptions
		
		System.out.println(i[0]); //10
		System.out.println(i[3]); //40
	//	System.out.println(i[4]); // AIOB(ArrayIndexOutOfBoundException)
	//	System.out.println(i[-1]); //AIOB
		
		System.out.println("**********************************");
		
		// to print all the value from array:
		//index based loop:
		for(int k = 0; k<=i.length-1; k++) {   //k<i.length;
			System.out.println(i[k]);   //10 20 30 40
		}
		
		System.out.println("**********************************");
		
		// case: if you don't give(enter) value to all index.it will take 0 by default.
		//because default value of integer is 0
		int p[] = new int[4];
		p[2] = 30;
		System.out.println(p[0]); //0 // take 0 by default if you not give value to the index
		System.out.println(p[2]); //30
		System.out.println(p[3]); //0  
		
		
		System.out.println("**********************************");
		
		//to print all the values from array without loop:
		System.out.println(Arrays.toString(i));  //[10, 20, 30, 40] //not converting into string.just give string representation of ArrayS
		
		System.out.println("--------------");
		//for each:
		for(int e : i) {   // scope of e is within for loop //e go to i and fetch the value one by oneS
			System.out.println(e);
			    if(e==20) {
			    	System.out.println("bye");
			    	break;  //break out of for loop
			    }
		}
		
		System.out.println("--------------");
		System.out.println("memory address: " + i);  //[I@34c45dca //it gives memory location 
		//we cannot print array directly in SOP
		
		
		//2. double array:
		double d[] = new double[4];
		d[0] = 12.22;
		d[1] = 23.44;
		d[2] = 34.55;
		d[3] = 45.66;
		
		System.out.println(d[0] + d[1]);
		
		System.out.println(Arrays.toString(d));
		
		for(double e : d) {    // scope of e is within for loop
			System.out.println(e);
		}
		
		
		// 3.char array:
		char ch[] = new char[4];
		ch[0] = 'a';
		ch[1] = '1';
		ch[2] = '$';
		ch[3] = 'd';
		
		System.out.println(ch.length);  //4
		System.out.println("highest index: " + (ch.length - 1)); //3
		System.out.println("li index : " + 0);
		
		for(char e : ch) {
			 System.out.println(e);
			//System.out.println((int)e);  //ASCII value
		}
		
		//
		//String array:
		String lang[] = new String[4];
		lang[0] = "Java";
		lang[1] = "Python";   // default value of String is null // this line give you NPE
		lang[2] = "JavaScript";
		lang[3] = "DotNet";
		
		System.out.println(lang.length);
		
		for(String e : lang) {
			System.out.println(e);
			if(e.equals("Java")) {
				System.out.println("I Love Java");
			}
		if(e.equals("JavaScript")) {
			System.out.println("I hate JS");
		}
		}
		
		//Object Array: We can store mixed type of data
		//Object is a class in Java -- is a super class of all the classes in Java
		
		//Emp Info: Name(String) , age(int), salary(double), gender(char), isPermanent(boolean):
		Object emp[] = new Object[5];
		emp[0] = "Rashmi";
		emp[1] = 25;
		emp[2] = 25.55;
		emp[3] = 'f';
		emp[4] = true;
	
		
		System.out.println(emp.length);   //5
		for(Object e : emp) {
			System.out.println(e);
			   if(e.equals("Rashmi")) {
				   System.out.println("emp is from QA");
				   //break;
			   }
		}
		System.out.println("--------------");
		
		Object emp1[] = new Object[5];
		emp1[0] = "Naveen";
		emp1[1] = 25;
		emp1[2] = 25.55;
		emp1[3] = 'f';
		emp1[4] = true;
		
		for(int m=0; m<=emp1.length-1; m++) {
			System.out.println(emp1[m]);
			  if(emp1[m].equals("Naveen")) {
				  System.out.println("emp is from DEV");
			  }
		}
		System.out.println("--------------");
		//Static Array: we use
		//1. new keyword:
		//2. array literals:
		
		//String array: new Keyword -> we declare when we are not sure about all value.
				String lang1[] = new String[10]; // we taken memory for 10.but know only 4 value for now
				lang1[0] = "Java";
				lang1[1] = "Python";   
				lang1[2] = "JavaScript";
				lang1[3] = "DotNet";
		
		String pr[] = {"macbook","iphone","samsung"};
		//System.out.println(pr[3]); //AIOB
		
		Object data[] = {"macbook", 1000, 23.44, 'g', true};
		for(Object e : data) {
			System.out.println(e);
		}
	
	System.out.println(Arrays.toString(data));  //[macbook, 1000, 23.44, g, true]
	System.out.println(Arrays.toString(lang1)); //[Java, Python, JavaScript, DotNet, null, null, null, null, null, null]
}
}
