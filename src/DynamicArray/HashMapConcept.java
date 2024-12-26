package DynamicArray;

import java.util.HashMap;

public class HashMapConcept {
	
	
	//HashMap => is a class
	//HashMap -> dynamic storage
    //HashMap<k,v> :
	//it is used for storing key-value pairs using a hashtable. 
	// 1.store the value on the basis of key and value 
	 //name = naveen
	//marks = 100
	//seller = seller@gmail.com
	
	// 2.does not maintain order at all.
	// 3.it can have multiple(duplicate) key . it always take latest value of multiple same key.
	// 3. All the keys which are stored in a Hashmap are unique. //unique keys allowed
	// 4.it can have multiple duplicate values also.
	// 5.null keys are allowed
	// 6.null values also allowed.
	//not thread safe and not synchronized. 
	
	//put() -> used to add the key and value
	//get() -> used to fetch the value on the basis of key
	

	public static void main(String[] args) {
		
		HashMap<String, String> empMap = new HashMap<String, String>();
		
		empMap.put("Naveen", "SDET");
	 	empMap.put("Amrita", "SDET1");
		empMap.put("Rashmi", "SDET2");
		empMap.put("Ravi", "SDET Manager");
		empMap.put("Karem", "VP");
		empMap.put("Karem", "CEO");
		empMap.put("Karem", "CEO"); // karem key take latest value CEO
		empMap.put("Sheela", null);
		empMap.put(null, "CTO");   
		empMap.put(null, null);  
		
		
		System.out.println(empMap.get("Rashmi"));  //SDET2
		System.out.println(empMap.get("Karem"));  //CEO
		System.out.println(empMap.get("Tom"));	  //null
		System.out.println(empMap.get("Sheela")); // null
		System.out.println(empMap.get(null));   //CTO
		System.out.println(empMap.get(null)); //null
		
		
		System.out.println(empMap);  //{Amrita=SDET1, null=null, Sheela=null, Naveen=SDET, Ravi=SDET Manager, Rashmi=SDET2, Karem=CEO}
		//it doesn't maintains the order.maintain random order
		
		
		HashMap<String, Integer> browserMap = new HashMap<String, Integer>();
		
		browserMap.put("chrome", 100);
		browserMap.put("firefox", 90);
		browserMap.put("ie", 7);
		browserMap.put("safari", 10);
		
		System.out.println(browserMap);  //{chrome=100, safari=10, firefox=90, ie=7}
		
	    System.out.println(browserMap.get("firefox"));  //90
	
	}

}










