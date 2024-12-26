package HashmapConcepts;

import java.util.Hashtable;

public class HashTableDemo {

	public static void main(String[] args) {
		
		
		Hashtable<String, Integer>  marks = new Hashtable<>();
		
		marks.put("Naveen", 100);
		marks.put("Tom", 200);
		marks.put("Lisa", 300);
		marks.put("Peter", 400);
		marks.put("Ruby", 600);
		
		System.out.println(marks.get("naveen")); //null
		System.out.println(marks.get("Naveen")); //100
		System.out.println(marks.get("Peter"));  //400
		System.out.println(marks.get("Lisa"));  //300
		
		
	}

}
