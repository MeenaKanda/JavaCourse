package ArrayListConcepts;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo {
	
	// index => staring from 0. -ve index is not allowed
	//default capacity of arrayList =10;
	//then incresed by capcity/2

	public static void main(String[] args) {
		
		ArrayList<Object> ar = new ArrayList<Object>();
		
		ar.add(100);  //index=0
		ar.add("tom");
		ar.add(12.33);
		ar.add('m');
		ar.add(true);
		ar.add(null);
		
		ar.add(2, "meena");
		
		System.out.println(ar.size());
		System.out.println(ar);
		
		//List with other collection::
		
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(10,20,30,40));
		
		System.out.println(numbers);
		
		ArrayList<String> names = new ArrayList<String>(Arrays.asList("java","python","c++","php"));
		System.out.println(names);
		System.out.println(names.size());

		
	}

}
