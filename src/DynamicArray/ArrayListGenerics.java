package DynamicArray;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListGenerics {

	public static void main(String[] args) {
		
		ArrayList<Integer> numList = new ArrayList<Integer>();
		 
		numList.add(100);
		numList.add(200);
		numList.add(300);
		numList.add(400);
		
		System.out.println(numList.size());  //4
		
/*	//for each loop:
		for(Integer e : numList) {
			System.out.println(e);
		}*/
		
		ArrayList<String> empNameList = new ArrayList<String>();
		empNameList.add("Naveen");
		empNameList.add("Tom");
		empNameList.add("Peter");
		
/*		for(String e : empNameList) {
			syso
		}*/
		
		System.out.println(empNameList);  //[Naveen, Tom, Peter]
		
		ArrayList<Object> empDataList = new ArrayList<Object>();  //can have any type of data
		empDataList.add("Tom");
		empDataList.add(20);
		empDataList.add(true);
		empDataList.add(12.33);
		empDataList.add('m');
		
		empDataList.remove(12.33);  //remove on the basis of value
		
		for(int i=0; i<empDataList.size(); i++) {
			System.out.println(empDataList.get(i));
		}
		
		System.out.println(empDataList);  //[Tom, 20, true, 12.33, m]
		
//		Collections.sort(empDataList);   //The method sort(List<T>) in the type Collections is not applicable for the arguments (ArrayList<Object>)

//        Collections.reverse(empDataList);
//        System.out.println(empDataList);
		
//		for(Object e : empDataList) {
//			System.out.println(e);
//		}
		
	}

}
