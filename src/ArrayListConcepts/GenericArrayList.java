package ArrayListConcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;

public class GenericArrayList {

	public static void main(String[] args) {
		
		ArrayList<Integer> markList = new ArrayList<Integer>();
		
		markList.add(100);
		
		System.out.println(markList);
		
		ArrayList<Double> arD = new ArrayList<Double>();
		arD.add(12.33);
		arD.add(100.00);
//		arD.add(100);  //can not add integer 
		
		System.out.println(arD);
		
		ArrayList<String> StudentNames = new ArrayList<String>();
		StudentNames.add("Tom");
		
		System.out.println(StudentNames);
	}

}
