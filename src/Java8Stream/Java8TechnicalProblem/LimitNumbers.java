package Java8Stream.Java8TechnicalProblem;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class LimitNumbers {

	public static void main(String[] args) {
		
	List<Integer> list = Arrays.asList(1,3,5,7,9,11,13,15,17,19,3,4,7,9,34,65,71);

	//get first 5 numbers 
	List<Integer> l = list.stream().limit(5).collect(Collectors.toList());
	System.out.println(l);
	
	int sum = list.stream().limit(5).reduce((a,b)-> a+b).get();
	System.out.println(sum);
	
	
	//skip:
	List<Integer> sk = list.stream().skip(5).collect(Collectors.toList());
	System.out.println(sk);
	
	int skSum = list.stream().skip(5).reduce((a,b) -> a+b).get();
	System.out.println(skSum);
	
	
	
	}

}
