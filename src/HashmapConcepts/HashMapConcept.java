package HashmapConcepts;

import java.util.HashMap;
import java.util.Map;

public class HashMapConcept {

	public static void main(String[] args) {

		Map<String, Integer> marks = new HashMap<String, Integer>();

		marks.put("Naveen", 100);
		marks.put("Tom", 200);
		marks.put("Lisa", 300);
		marks.put("Peter", 400);
		marks.put("Robby", 600);
		
		marks.put(null, 500);    // hashcode for null key is 0
        marks.put("Meena", null);

		
		//hashing : hashcode() -- > hashing
        
        System.out.println(marks.get("Lisa"));
        
        
        // code for the get method:::
        //hashcode of Lisa  -- 210678
        //index = 15
        //.equals to check the key name
        //Lisa
        //return value
	}

}
