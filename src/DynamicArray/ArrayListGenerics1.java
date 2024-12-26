package DynamicArray;

import java.util.ArrayList;

public class ArrayListGenerics1 {

	public static void main(String[] args) {
		
		ArrayList<Integer> numList = new ArrayList<Integer>();
		 
		numList.add(100);
		numList.add(200);
		numList.add(300);
		numList.add(400);
		
		System.out.println(numList.size());  //4
		
		//for each loop
		
		//for( int i=0; i<numList.size(); i++) {
		//	System.out.println(numList.get(i));
		//}
		
		//System.out.println("----------------");
		for (Integer i : numList)
		{
		System.out.println(i);
		}
		for(Integer e : numList) {
			System.out.println(e);
		}

	}

}
