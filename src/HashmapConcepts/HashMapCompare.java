package HashmapConcepts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class HashMapCompare {

	public static void main(String[] args) {
		
		
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		
		map1.put(1, "A");
		map1.put(2, "B");
		map1.put(3, "C");
		
		HashMap<Integer, String> map2 = new HashMap<Integer, String>();
		
		map2.put(3, "C");
		map2.put(1, "A");
		map2.put(2, "B");
	
		HashMap<Integer, String> map3 = new HashMap<Integer, String>();

		map3.put(1, "A");
		map3.put(2, "B");
		map3.put(3, "C");
		map3.put(3, "D");  // take latest key values
		
		
		
		// 1. on the basis of  key_value: use equals method:
		System.out.println(map1.equals(map2));  // true // order doesn't matter
		System.out.println(map1.equals(map3));  //false
		
		
		System.out.println(map1); //{1=A, 2=B, 3=C}
		System.out.println(map2); //{1=A, 2=B, 3=C}
		System.out.println(map3); //{1=A, 2=B, 3=D}

        System.out.println("===============================");
		
		// 2.compare hasmaps for the same keys: keySet():
		System.out.println(map1.keySet().equals(map2.keySet())); //true
		
		System.out.println(map1.keySet().equals(map3.keySet())); //true  
		// keySet() give only unique set. so it will ignore map3.put(3,"D"). so returns true 
		
		System.out.println(map1.keySet());  //[1, 2, 3]
		System.out.println(map2.keySet());  //[1, 2, 3]
		System.out.println(map3.keySet());  //[1, 2, 3]

		
		
		System.out.println("===================================  ");
		
		// 3. find out the extra keys:
		HashMap<Integer, String> map4 = new HashMap<Integer, String>();

		map4.put(1, "A");
		map4.put(2, "B");
		map4.put(3, "C");
		map4.put(4, "D");
		
		//combine the keys from both maps: using HashSet: // find out extra key from hashmap?
		// HashSet => store only unique element. doesnot store key and value format  
		HashSet<Integer> combineKeys = new HashSet<Integer>(map1.keySet());    // keySet() = gives keys
		
		combineKeys.addAll(map4.keySet());
		System.out.println(combineKeys); //[1, 2, 3, 4]

		combineKeys.removeAll(map1.keySet());
		System.out.println(combineKeys);  //[4]
		
		System.out.println(map1.keySet()); 
//		System.out.println(map1.keySet().addAll(map4.keySet()));  //UnsupportedOperationException
		System.out.println(map4.keySet()); //[1, 2, 3, 4]

		
		System.out.println("===========================================");
		
		// 4. compare maps by values::
		
        HashMap<Integer, String> map5 = new HashMap<Integer, String>();
		
		map5.put(1, "A");
		map5.put(2, "B");
		map5.put(3, "C");
		
		HashMap<Integer, String> map6 = new HashMap<Integer, String>();
		
		map6.put(4, "A");
		map6.put(5, "B");
		map6.put(6, "C");
	
		HashMap<Integer, String> map7 = new HashMap<Integer, String>();

		map7.put(1, "A");
		map7.put(2, "B");
		map7.put(3, "C");
		map7.put(4, "C");
		
		// 1. duplicate are allowed : using ArrayList ( ArrayList allows duplicate values)::
		
		System.out.println(new ArrayList<>(map5.values()).equals(new ArrayList<>(map6.values()))); //true
		System.out.println(new ArrayList<>(map5.values()).equals(new ArrayList<>(map7.values()))); //false
		
/*		System.out.println(map5.values());  //[A, B, C]
		System.out.println(map6.values()); //[A, B, C]
		System.out.println(map7.values()); //[A, B, C, C]
		System.out.println(map5.values().equals(map6.values())); //false
		System.out.println(map5.values().equals(map7.values())); //false
*/
		
		
		//2. duplicate are not allowed : using HashSet (hashset allows only unique values)
		System.out.println(new HashSet<>(map5.values()).equals(new HashSet<>(map6.values()))); //true
		System.out.println(new HashSet<>(map5.values()).equals(new HashSet<>(map7.values()))); //true  // dublicate removed

		System.out.println(new HashSet<>(map5.values()));  //[A, B, C]
		System.out.println(new HashSet<>(map7.values()));  //[A, B, C]

	
	}

}
