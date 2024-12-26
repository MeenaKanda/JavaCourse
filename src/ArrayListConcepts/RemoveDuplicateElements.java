package ArrayListConcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class RemoveDuplicateElements {
	
	// set => property of set is they can not have duplicate values

	public static void main(String[] args) {
		
		
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,2,3,2,2,3,1,4,5,6,7,8,9,7,5));
		
		System.out.println(numbers);  // [1, 2, 3, 2, 2, 3, 1, 4, 5, 6, 7, 8, 9, 7, 5]

		
		// 1. LinkedHashSet: 
		// linkedHashSet will remove the duplicate values from the ArrayList
		
		LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>(numbers);
		
		ArrayList<Integer> numbersListWithoutDuplicate = new ArrayList<Integer>(linkedHashSet);
		
		System.out.println(numbersListWithoutDuplicate);  //[1, 2, 3, 4, 5, 6, 7, 8, 9]

		
		// JDK 8 - Stream:: // after jdk 8
		
		ArrayList<Integer> markList = new ArrayList<Integer>(Arrays.asList(1,2,3,2,2,3,1,4,5,6,7,8,9,7,5));

		List<Integer> marksListUnique = markList.stream().distinct().collect(Collectors.toList());
		
		System.out.println(marksListUnique); //[1, 2, 3, 4, 5, 6, 7, 8, 9]
	}

}
