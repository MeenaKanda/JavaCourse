
package HashmapConcepts;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapConcepts {

	public static void main(String[] args) {

		// tree map maintain ascending order in number and alphabets
		
		TreeMap<Integer, String> map = new TreeMap<>();
		
		map.put(1000, "Tom");
		map.put(3000, "Peter");
		map.put(2000, "Steve");
		map.put(11000, "Naveen");
		map.put(1400, "Robert");
		
		System.out.println(map);  //{1000=Tom, 1400=Robert, 3000=Steve, 11000=Naveen}
		
		map.forEach((k,v) -> System.out.println("key = " + k + " value = " + v));
		
		System.out.println(map.lastKey());  //11000
		System.out.println(map.firstKey()); //1000
		
		
		Set<Integer> keysLessThan3000 = map.headMap(3000).keySet();
		System.out.println(keysLessThan3000);    //[1000, 1400, 2000]
		
		Set<Integer> keysgreater3000 = map.tailMap(3000).keySet();
		System.out.println(keysgreater3000);  //[3000, 11000]
		
		
		
		TreeMap< String, Integer> userMap = new TreeMap<>();
		
		userMap.put("James", 100);
		userMap.put("Brad", 200);
		userMap.put("Albert", 400);
		userMap.put("George", 50);
		userMap.put("Larry", 900);
		userMap.put("Ted", 120);
		userMap.put("Paul", 300);
		
		userMap.forEach((k,v) -> System.out.println("key = " + k + " value = " + v));
		
		
        TreeMap<Integer, String> map1 = new TreeMap<>(Comparator.reverseOrder());
		
		map1.put(1000, "Tom");
		map1.put(3000, "Peter");
		map1.put(2000, "Steve");
		map1.put(11000, "Naveen");
		map1.put(1400, "Robert");
		
		System.out.println(map1);  //{11000=Naveen, 3000=Peter, 2000=Steve, 1400=Robert, 1000=Tom}  //descending order //reverse
		}

}
