package Java8Stream.Java8TechnicalProblem;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SumOfNumbers {

	public static void main(String[] args) {
		
	List<Integer> list = 	Arrays.asList(1,4,5,7,8,5,9,10,44,52,76,31);

	//1. using reduce() method:
	Optional<Integer> sum = list.stream().reduce((a,b) -> a+b);
	System.out.println("Sum of numbers : " + sum.get());
	
	int  sum1 = list.stream().reduce(0, (a,b) -> a+b);
	System.out.println("Sum of given numbers : " + sum1);
	
	
	//2. using sum() method with mapToInt():
	int sum2 = list.stream().mapToInt(Integer::intValue).sum();
	System.out.println("Sum of numbers are : " + sum2);
	
	
	
	
	}

}
