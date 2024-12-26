package SetConcepts;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetConcepts {
	
	//HashSet => no duplicate value allowed
	//index will not work. no maintain order
	//1 null value allowed
	

	public static void main(String[] args) {
		
		
		Set<String> hs = new HashSet<String>();
		
		hs.add("Alpha");
		hs.add("Beta");
		hs.add("Testing");
		hs.add("Beta");  //duplicate not allowed but it will not show error
		hs.add("Alpha");
		hs.add(null);
		
		System.out.println(hs); //[null, Alpha, Beta, Testing]  //it does not maintain any order
		
	//	System.out.println(hs.get); // it does not maintain index order . so get method is not possible
		
		System.out.println(hs.contains("Testing"));
		
		//for-each loop:: iterator
		
		for(String e : hs) {
			System.out.println(e);
		}
		
		System.out.println("========================");
		
		// for-loop  // not possible
/*		for(int i=0; i<hs.size(); i++) {
			System.out.println(hs.get);
		}
*/			
		// iterator:
		Iterator<String> it = hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		System.out.println("========================");
		
		hs.remove("Beta");
		System.out.println(hs);  //[null, Alpha, Testing]
		
		System.out.println("========================");
		
	/*	Set<Integer> first = new HashSet<Integer>(Arrays.asList(1,2,3,4,5,6,8,9,10));
		System.out.println(first);  //[1, 2, 3, 4, 5, 6, 8, 9, 10]
		
		Set<Integer> second = new HashSet<Integer>(Arrays.asList(1,2,0,5,6,7,9,10));
		System.out.println(second);  //[0, 1, 2, 5, 6, 7, 9, 10]
		
		first.addAll(second);
		System.out.println(first);  //[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
		*/
		
		System.out.println("========================");
		
		Set<Integer> first = new HashSet<Integer>();
 //    	first.addAll(Arrays.asList(1,2,3,4,6,8,9));
	    first.addAll(Arrays.asList(new Integer[] {1,2,3,4,6,8,9}));
		System.out.println(first);  //[1, 2, 3, 4, 6, 8, 9]
		
		Set<Integer> second = new HashSet<Integer>();
 //       second.addAll(Arrays.asList(1,2,0,4,6,8,9,7,10)); //[0, 1, 2, 4, 6, 7, 8, 9, 10]
        second.addAll(Arrays.asList(new Integer[] {1,2,0,4,6,8,9,7,10}));
        System.out.println(second);
		
		Set<Integer> union = new HashSet<Integer>(first);
		union.addAll(second);
		System.out.println(union);//[0, 1, 2, 3, 4, 6, 7, 8, 9, 10]
  
		
		System.out.println("========================");
		
		//get the intersection:  //find common values
		Set<Integer> intersection = new HashSet<Integer>(first);
		intersection.retainAll(second);
		System.out.println(intersection);  //[1, 2, 4, 6, 8, 9]  

		System.out.println("========================");
		
		//get the difference::
		Set<Integer> diff = new HashSet<Integer>(first);
		diff.removeAll(second);
		System.out.println(diff);   //[3]
	
	
	
	System.out.println("8*************************************************");
	
	LinkedHashSet<String> lhs = new LinkedHashSet<String>(); //maintain insertion order  
	lhs.add("Kanda");
	lhs.add("Abby");
	lhs.add("Meena");
	lhs.add("Tanish");
	lhs.add("Balu");
	lhs.add("Sammu");
	
	System.out.println(lhs); //[Kanda, Abby, Meena, Tanish, Balu, Sammu]
	
	
	TreeSet<Integer> tset = new TreeSet<Integer>(); //maintain sorted order
	tset.add(11);
	tset.add(1);
	tset.add(55);
	tset.add(78);
	tset.add(12);
	tset.add(3);
	
	System.out.println(tset); //[1, 3, 11, 12, 55, 78]
	
	}

}
