package ArrayListConcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListCompare {

	public static void main(String[] args) {
		
		// 1. sort and then equals::
		
		ArrayList<String> l1 = new ArrayList<String>(Arrays.asList("B","E","A","C","D"));
		ArrayList<String> l2 = new ArrayList<String>(Arrays.asList("C","F","D","B","A"));
		ArrayList<String> l3 = new ArrayList<String>(Arrays.asList("B","E","A","C","D"));

		Collections.sort(l1);
		Collections.sort(l2);
		Collections.sort(l3);
		
		System.out.println(l1);
		System.out.println(l2);
		
		System.out.println(l1.equals(l2)); //false
		System.out.println(l1.equals(l3)); //true
		
		
		//2. compare two list  - find out the additional elements::
		ArrayList<String> l4 = new ArrayList<String>(Arrays.asList("B","E","A","C","D"));
		ArrayList<String> l5 = new ArrayList<String>(Arrays.asList("C","F","D","B","A"));
		
	
//	    l4.removeAll(l5);
//		System.out.println(l4);  //[E]
		
	////3. find out the missing elements:::
		
		l5.removeAll(l4);
		System.out.println(l5);  //[F]
		
		
		// 4. find out the common elements::
		
		ArrayList<String> lang1 = new ArrayList<String>(Arrays.asList("Java","Python","Ruby","C#","JS"));
		ArrayList<String> lang2 = new ArrayList<String>(Arrays.asList("Java","Python","Ruby","C#","PHP"));
		
		lang1.retainAll(lang2);
		System.out.println(lang1); //[Java, Python, Ruby, C#]

		
	}

}
