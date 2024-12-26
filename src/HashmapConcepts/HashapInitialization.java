package HashmapConcepts;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HashapInitialization {

	
	public static HashMap<String, Integer> markMap;
	
	static {
		markMap = new HashMap<>();   // unnecessary creation of object inside static. it may cause unnecessary stack over flow in memeory management
		markMap.put("A", 100);
		markMap.put("B", 200);
	}
	
	
	public static void main(String[] args) {
		
		//1. using HashMap class::
		
		HashMap<String, String> map1 = new HashMap<>();
		Map<String, String> map2 = new HashMap<>();
		
		//2. static way :static hashmap:   // we dont prefer initializing map in static way, better avoid
		
		System.out.println(HashapInitialization.markMap.get("A"));  
		
		
		// 3. immutable map with only one single entry::
		Map<String, Integer> map3 = Collections.singletonMap("test", 400);
		map3.get("test");  //100
		
//		map3.put("abc", 500);  //UnsupportedOperationException
		
		
		
		// 4. JDK 8::
		
		Map<String, String> map4 = Stream.of(new String[][]{
			
			{"Tom", "A grade"},
			{"Naveen", "A+ grade"},
			{"Meena", "A++ grade"},
		}).collect(Collectors.toMap(data -> data[0], data -> data[1]));
		
	
	System.out.println(map4.get("Tom"));
	map4.put("Lisa", "B grade");
	System.out.println(map4.get("Lisa"));
	

	
	// using SimpleEntry::
	Map<String, String> map5 = Stream.of(
			new AbstractMap.SimpleEntry<>("Naveen", "Java"),
	        new AbstractMap.SimpleEntry<>("Tom", "Python")
			
			).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
	
	System.out.println(map5.get("Naveen"));
	map5.put("Lisa", "c++");
	System.out.println(map5.get("Lisa"));
	
	
	// JDK 1.9 :
	// create empty map:
	Map<String, String> emptyMap = Map.of();
	
/*	emptyMap.put("Tom", "python");  // we can not add value in empty map
	System.out.println(emptyMap.get("Tom");  //UnsupportedOperationException
	*/
	
	
	
	// singleton Map : only one value can enter not more than that
	Map<String, String> singletonMap = Map.of("k1", "v1");
	System.out.println(singletonMap.get("k1"));
//	singletonMap.put("k2", "v2");  //UnsupportedOperationException
	
	
	
	// multi value Map:  max 10 pairs can be stored
	Map<String, String> multiMap = Map.of("k1", "v1", "k2", "v2", "k3", "v3");
	System.out.println(multiMap.get("k3"));  //v3
	
	// immutable means we can not add more/change values
	// ofEntries Method : no limitaions on pairs (key-value) // this is  immutable 
	//Immutable Map:
	Map<String, Integer> map7 = Map.ofEntries(
			new AbstractMap.SimpleEntry<>("A", 100),
			new AbstractMap.SimpleEntry<>("B", 200),
			new AbstractMap.SimpleEntry<>("C", 300)
			);
	
	System.out.println(map7.get("c"));
//	map7.put("D", 400);  //UnsupportedOperationException  
	
	
	
	// maps using Guava:  //immutable map
/*	Map<String, String> titleMaps = ImmutableMap.of("Google", "Google India", "Amazon", "Amazon shopping");
	System.out.println(titleMaps.get("Google"));
	titleMap.put("Rediff", "Rediff India");
	
	*/
	
	//ImmutableMap() => coming from Guava not jdk. so it is not supporing in my laptop
	
	// how to create mutable and immutable maps?
	
	System.out.println("++++++++++++++++++++++++++++++");
	
	List<Integer> li = Collections.singletonList(10);
	System.out.println(li); //[10]
/*	li.add(20);  //UnsupportedOperationException
	System.out.println(li);
*/
	
	Set<String> sset = Collections.singleton("Meena");
	System.out.println(sset);  //[Meena]
/*	sset.add("Abby");  //UnsupportedOperationException
	System.out.println(sset);
	*/
	
	}

}

//using singletonMap() => only one entry will be possible. not add 2 or more it give you unsupportedOpeartionException.