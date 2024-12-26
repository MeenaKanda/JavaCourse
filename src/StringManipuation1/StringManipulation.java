package StringManipuation1;

import java.util.Arrays;

public class StringManipulation {

	
	public static void main(String[] args) {
		//String always maintain char Array internally.
		
		String str = "hi this is my java code and I am so happy";
		
		System.out.println(str.substring(3));
		System.out.println(str.substring(3, 6));
		
		
		System.out.println(str.length());
		int len = str.length();
		int li = 0;   //lowest index
		int hi = len-1; //higest index
		System.out.println(hi);
		
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(15));
		System.out.println(str.charAt(5));
		System.out.println(str.charAt(40));
	//	System.out.println(str.charAt(41));  //StringIndexOutOfBoundsException
   //    System.out.println(str.charAt(-1)); //StringIndexOutOfBoundsException
        System.out.println(str.charAt(2));  //space
	
	
        System.out.println(str.indexOf('h'));  //0  //shows first occurance of h
        System.out.println(str.indexOf("java")); //14  //show where j 
	    System.out.println(str.indexOf("Java"));  //-1 //case sensitive
        
        String m1 = "welcome admin";
        if(m1.indexOf("admin") == 8) {
        	System.out.println("admin user is present");
        }
        else {
        	System.out.println("FAIL");
        }
        	
        System.out.println(str.indexOf('i')); //1st occurrence of i
        System.out.println(str.indexOf('i', str.indexOf('i')+1 )); //2nd occurance of i
	
//        String identify = "i";
//        int index = str.indexOf(identify);
//        while (index >=0 )
//        {
//        	System.out.println("index position is :: " + index);
//        	index = str.indexOf(identify, index+1);
//        }
    
        //find n no of occcurence of i: 
       int index =  str.indexOf("i");
       while(index>=0) {
    	   System.out.println("index position is : " + index);
    	   index = str.indexOf("i", index+1);
       }
	   
       String m2 = "product name is macbook";
       if(m2.indexOf("mackbook") != -1) {
    	   System.out.println();
       }
        
       //
       String test = "this is java program";
       System.out.println(test);  // this is java program
       System.out.println(test.toUpperCase()); //THIS IS JAVA PROGRAM
       System.out.println(test);   //this is java program
       System.out.println(test.toLowerCase());
       
       //trim:  //trim corner only,not b/w words
       String p = "   hello world     ";
       System.out.println(p.trim());
       
       //replace:
       String p1 = "hello world";
       System.out.println(p1.replace('o', 'w')); //hellw wwrld
       System.out.println(p1.replace(" ", ""));  //hello world
       
       String dob = "01-01-1990";  //01/01/1990
       System.out.println(dob.replace("-", "/"));
       
       String mesg = "I love Java love";
       System.out.println(mesg.replace("love", "hate")); //I hate Java
       
       
       String q = "   hello world     ";
       System.out.println(q.replaceAll( " ", "")); //helloworld
       
       //equals:
       String e1 = "hello selenium";
       String e2 = "hello Selenium ";
       System.out.println(e1.equals(e2));  //false
       System.out.println(e1.equalsIgnoreCase(e2.trim())); //true
       
       
       //contains:  //we cannot ignore cases in this method
       String tg = "welcome to naveen training";
       
       System.out.println(tg.contains("Naveen"));  //false
       if(tg.contains("Naveen")) {
    	   System.out.println(" enroll for it");
       }
       else {
    	   System.out.println("no need to enroll for it");
       }
       
       //split:what basis you want to split
       //what is the return type of split function in String? -> String Array
       
        String lang = "JAVA_PYTHON_RUBY_DOTNET";
        
        String l[] = lang.split("_");
        System.out.println(l.length);  //4
       System.out.println(Arrays.toString(l));  // [JAVA, PYTHON, RUBY, DOTNET]
       
       String pop = "xXtestingxXseleniumXxXautomationXXxXTraingingX";
       String n[] = pop.split("xX");  //start array from left side of xX
       System.out.println(n[0]); //nothing
       System.out.println(n[0].length()); //0 //length of blank 0
       System.out.println(n[1]);  //testing
       System.out.println(n[2]);  //seleniumX
       System.out.println(n[3]);  //automationXX
       System.out.println(n[4]);  //TraingingX
 //      System.out.println(n[5]);  //ArrayIndexOutOfBoundsException
       System.out.println(n.length); //5
       System.out.println(Arrays.toString(n)); //[, testing, seleniumX, automationXX, TraingingX]
       
       System.out.println("--------------------"); 
       
       //Extract a number from a given input String: 
       String s5 = "This is your order id 11234";
       System.out.println(s5.length()); //27
       
       System.out.println(s5.substring(s5.indexOf("id")+3, s5.length())); //11234
       
       String s6 = "Your order 4536 is generated successfully";
       String sub = s6.substring(s6.indexOf("order")+6, s6.indexOf("i")-1);   
       System.out.println(sub);    //4536
       
	}

}
