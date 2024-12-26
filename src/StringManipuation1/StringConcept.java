 package StringManipuation1;

public class StringConcept {
	//String->most commonly used values in ecommerce everywhere
	//SCP -> String Constant Pool
	//property of SCP -> it cannot have duplicate string values

	
	public static void main(String[] args) {
	
		//String literal:
		String str = "Selenium";  //str, str1 pointing same to "Selenium"
		String str1 = "Selenium";
        String str2 = "selenium";  //case sensitive // new obj will be created
        
        //3 different 100 will be created and referred by i,j,k
        int i = 100;
        int j = 100;  
        int k = 100;
        
        
        String t1 = "Java";
        
        System.out.println(str == str1);  //true  //it comparing reference(memory address)which pointing to same obj(value)
        System.out.println(str.equals(str1)); //true  //it comparing respective value,not ref
        
        //String object with new keyword:
        String s1 = new String("testing"); //2 obj crated //it create one new obj ref by s1 in heap and also one more in SCP ref by no one // total 2 
        String s2 = new String("testing"); //1 obj created //it create one new obj ref by s2 in heap and go to SCP to create one more obj in SCP. but already there is "testing" in SCP
        //so dont create dublicate obj in SCP.
        String s3 = "testing";  //0 obj created // already "testing" obj in SCP.pointing same testing
        String s4 = "testing";  //0 obj created
        
		System.out.println(s3 == s4); //true // == compare on the basis on ref( memory address) which are pointing to same obj "testing".
        System.out.println(s1 == s2); //false //s1 and s2 pointing to different obj. now both obj are getting compared.both are differnt no where releated. so false
	    System.out.println(s1.equals(s2));//true //.equals-> compare on the basis of value. both values are same . true
	    
	    //so always prefer .equal() method to avoid bug in the code.
	    System.out.println(s1 == s3); //false
	    System.out.println(s3 == s4); //true
	    System.out.println(s3.equals(s4)); //true
	    
	    String s5 = "Testing"; //1 //SCP //i obj created in SCP
	    s5 = null;
//	    System.out.println(s5.length()); //NullPointerException
	    //Testing is pointed by no one.
	    
	    String s6 = "Naveen";
	    s6 = "Aksha";   //s6 break connection from Naveen and s6 start ref Aksha
	    //Naveen pointed by no one.
	    //so Testing and Naveen is ready for Garbage collector. because SCP is part of heap memory.
	    
	}

}
