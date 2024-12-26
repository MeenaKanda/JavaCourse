package HashmapConcepts;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapBasics {
	
	// no order - no indexing
	// stores values - Key-Value <k,v>
	// key can not be duplicate.
	// can store n number of null values byt only one null key
	// if key null is duplicate it take latest duplicate key value
	// hashmap is not thread safe -unsynchronized
	
	
	//keySet()
	//get()
	
	//entrySet() -> returns Entry
	//getKey() => get the value from the set  - used in Entry class(iterator)
	//getValue() => get the value from the set
	
	public static void main(String[] args) {
		
		HashMap<String, String> capitalMap = new HashMap<String, String> ();
		capitalMap.put("India", "New Delhi");
		capitalMap.put("USA", "Washington DC");
		capitalMap.put("UK", "London");
		capitalMap.put("UK", "London11");  //latest 
		capitalMap.put(null, "Berlin");
		capitalMap.put(null, "LA");    // latest
		capitalMap.put("Russia", null);
		capitalMap.put("France", null);
		capitalMap.remove("France");
		capitalMap.remove(null);   // remove all duplicate null values

		System.out.println(capitalMap.get("USA"));
		System.out.println(capitalMap.get("UK"));

		System.out.println(capitalMap.get(null));
		System.out.println(capitalMap.get("France"));
		System.out.println(capitalMap.get("Russia"));
		
		// 1. iterator: over the keys:
		Iterator<String> it = capitalMap.keySet().iterator(); // it return the iterator of keySet
		
		while(it.hasNext()) {
			String key = it.next();
			String value = capitalMap.get(key);
			System.out.println("key = " + key + " value = " + value);
		}
		
		System.out.println("=====================");
		
		// 2. iterator: over the set (pair) : by using entrySet
		
		Iterator<Entry<String, String>> it1 = capitalMap.entrySet().iterator();  // it returns iterator of entry
		// Entry is a class // entrySet() = have key value set
		
		while(it1.hasNext()) {
			Entry<String,String> entry= it1.next();
			System.out.println("key = " + entry.getKey() + " value = " + entry.getValue());
			
		}
		
		System.out.println("=====================");
		
		// 3. iterator hashmap using java 8 for each and lambda::
		
		capitalMap.forEach((k,v) -> System.out.println("key = " + k + " value = " + v));
	}

}

// keySet() => Returns a Set view of the keys contained in this map.The set is backed by the map, so changes to the map arereflected in the set, and vice-versa.
//entrySet() => Returns a Set view of the mappings contained in this map.The set is backed by the map, so changes to the map arereflected in the set, and vice-versa.

