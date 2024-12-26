package HashmapConcepts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapToArrayList {
	public static void main(String[] args) {
		
		HashMap<String, Integer> compMap = new HashMap<String, Integer>();
		compMap.put("Google", 10000);
		compMap.put("Walmart", 20000);
		compMap.put("Amazon", 30000);
		compMap.put("Facebook", 40000);
		compMap.put("Cisco", 50000);
		
		System.out.println("company map size = " + compMap.size());
		
		
		//iterate
		
		Iterator<Entry<String, Integer>> it = compMap.entrySet().iterator();
		
		while(it.hasNext()){
			Entry <String, Integer> pairs = it.next();
			System.out.println("key = " + pairs.getKey() + "  Value = " + pairs.getValue());
		}
		
		System.out.println("=============================");
		
		// JDK 8 lambda :
		
		compMap.forEach((k,v) -> System.out.println("key = " + k + " value = " + v));
		compMap.forEach((k,v) -> System.out.println( k+ " = " +v));
		
		System.out.println("=============================");
		
		
		//convert hashmap keys into ArrayList:
		
		 ArrayList<String> compNameList = new ArrayList<String>(compMap.keySet());
		 System.out.println(compNameList); //[Google, Walmart, Cisco, Amazon, Facebook]
		 System.out.println("total company count = " + compNameList.size());
		 
		 
		 for(String e : compNameList) {
			 System.out.println("company Name list = " + e);
		 }
		
		 System.out.println("==========================");
		 
		 // convert hashmap values into ArrayList::
		 ArrayList<Integer> compValueList = new ArrayList<Integer>(compMap.values());
		 System.out.println("total emp value list = " + compValueList.size());
		 
		 
		 for(Integer e : compValueList) {
			 System.out.println("company value list = " + e);
		 }
		 
	}

}
