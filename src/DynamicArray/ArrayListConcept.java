package DynamicArray;

import java.util.ArrayList;

public class ArrayListConcept { 
	

	public static void main(String[] args) {

		// Static Array: size is fixed //ex total no of flight ticket, movie ticket, no
		// of month, days
//		int i[] = { 1, 2, 3, 4, 5 };
//		int l[] = new int[50];

		// dynamic array:
		//ArrayList: is a dynamic data structure in which you can add or remove any number of elements.
		//ArrayList  - default class
		//ArrayList is order based collection : it maintain the order/index
		// initially :VC = 10 and PC =0
		//VC -> don't take any bytes and bits
		//arrayList-> accept duplicate value, null value
		//no limit size for arrayList.
		// If generic are not used, ArrayList can hold any type of objects.
		
		
	    ArrayList ar = new ArrayList();   //raw type array list
		System.out.println(ar.size());  //0
		
		ar.add(100);  //0 index   //add() is non-static method, because we create obj and call method using ref vars
		ar.add(200);  //1
		ar.add(300);  //2
		
		System.out.println(ar.size());  //3
		
		ar.add(400);  //3
		ar.add(500);  //4
		
		System.out.println(ar.size());  //5
		
		ar.add("testing"); //5
		ar.add(23.44);  //6
		ar.add(true);  //7
		ar.add('g');  //8
		ar.add(1000);  
		
		System.out.println(ar.size());  //10
		
		System.out.println(ar.get(0));
		System.out.println(ar.get(9));  //1000
		System.out.println(ar.get(6));
//		System.out.println(ar.get(10));  //IOB
		
		ar.remove(8); 
		System.out.println(ar.get(8));  //1000
		
		System.out.println(ar.size());  
		System.out.println(ar.get(7));  //true
		
		ar.remove(23.44);  
	
		
		//1.print the arraylist
		System.out.println(ar);  //[100, 200, 300, 400, 500, testing, 23.44, true, 1000]
		
		
		ArrayList empData = new ArrayList();   // not right way declare array list // raw type array list
		empData.add("Tom");
		empData.add("Bangalore");
		empData.add(1000);
		empData.add(true);
		
		System.out.println(empData.size());  //4
		
		System.out.println(empData.get(1));
		
		System.out.println(empData);  //[Tom, Bangalore, 1000, true]
		
		
		//2.for loop: iterate array
		for(int i=0; i<empData.size(); i++) {
			System.out.println(empData.get(i));
		}
		
	}

}
