package HashmapConcepts;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapSync {
	
	// HashMap => is not synchronized

	public static void main(String[] args) {
		
		//synchronizedMap method in collection class:
		Map<String, String> map1 = new HashMap<String, String>();
		
		map1.put("1", "Naveen");
		map1.put("2", "Tom");
		map1.put("3", "Lisa");
		map1.put("4", "Peter");
		
		// create synchronizedMap:
		Map <String, String> syncMap = Collections.synchronizedMap(map1);
		System.out.println(syncMap);  //{1=Naveen, 2=Tom, 3=Lisa, 4=Peter}
		
		
		//concurrentHashMpa: it does not throw any concurrentModificationException(because it is thread safe)
		ConcurrentHashMap<String, String> concurrentMap = new ConcurrentHashMap<>();
		concurrentMap.put("A","Java");
		concurrentMap.put("B","Python");
		concurrentMap.put("C","C++");
		
		System.out.println(concurrentMap.get("B")); //python
	}

}
