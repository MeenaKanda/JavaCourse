package Java8Stream.Java8TechnicalProblem;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindOddEvenNumbersInArray {

	public static void main(String[] args) {
		
    //1.
	List<Integer> numbers =	Arrays.asList(11,22,14,33,42,78,55,10,27,89,54,22);
		
	//evenNumber
	List<Integer> evenList = numbers.stream()
	       .filter(e->e%2==0)
	       .collect(Collectors.toList());
	
	System.out.println(evenList);
	
	//oddNumber
	
	List<Integer> oddList = numbers.stream()
		       .filter(e->e%2 !=0)
		       .collect(Collectors.toList());
		
	System.out.println(oddList);
	
	
	//2.
	
	int[] num = {34,67,10,43,77,24,87,29,10,54};
	
	//evenNumber
	List<Integer> evenNumber = Arrays.stream(num)
	      .filter(e->e%2==0)
	      .boxed()
	      .collect(Collectors.toList());
	System.out.println(evenNumber);
	
	List<Integer> oddNumber = Arrays.stream(num)
		      .filter(e->e%2 !=0)
		      .boxed()
		      .collect(Collectors.toList());
		System.out.println(oddNumber);
	

	}

}
