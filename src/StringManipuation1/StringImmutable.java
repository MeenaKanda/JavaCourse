package StringManipuation1;

import java.util.Arrays;

public class StringImmutable {

	
	public static void main(String[] args) {

		int i = 10;
		i = 20;
		i = 30; // latest value of i =30 and 10,20 gone from memory. they are mutable

//	String s = "Selenium";

//	s= "Cypress";  //updated value of s now s is pointing "Cypress"
//	//Selenium is not deleted from memory. it still there without ref(no one) (GC may remove if needed)
//	System.out.println(s); //Cypress
//	
//	String t = "Selenium"; //same "Selenium" ref by t now.
	
    String s = "Selenium";
    
    System.out.println(s+"automation"); //Seleniumautomation  //it create new obj(Seleniumautomation) now and ref by no one. it will not update old obj "Selenium" .
    
    System.out.println(s);  //Selenium
		
	s = "cypress";
	System.out.println(s);  //cypress
    
    String t1 = "Selenium";
    System.out.println(t1);  //Selenium
		
	
    String p = "Naveen";   //Naveen ref by p //
	p = p + "Automation Labs";  //new obj NaveenAutomationLabs will be created ref by p now.old "Naveen" still there but  ref by no one.
	System.out.println(p);	 //NaveenAutomation Labs
	
	String t2 = "Naveen"; // unref Naveen in SCP ref by t2 now.
	System.out.println(t2); //Naveen
	
	
	String r = "      hello selenium      ";
	r = r.trim();
	System.out.println(r); //hello selenium  //with trim
   
//	int i = 10;
//	i = 10 + 50;  //60
	// i is 60 now . i=10 is gone
	
	
	String s11 = "java_python_ruby";   //created in SCP
	String arr[] = s11.split("_");   //3 strings will be created in the form of array. stored in SCP not in heap(because no new keyword here)
    String t11 = arr[0] + "testing"; //one obj "java testing" will be created and ref by t11
	//s11 still pointing to same "java_python_ruby".
	
	System.out.println(s11); //java_python_ruby
	System.out.println(Arrays.toString(arr)); //[java, python, ruby]
	
	String test = "       testing   java   selenium     ";
	System.out.println(test.replaceAll(" ", "m"));  
	System.out.println(test.replace(" ", "n"));
	
	}

}
