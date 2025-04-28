package Java8Stream.Java8TechnicalProblem;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class AverageOfNumbers {

	public static void main(String[] args) {
	
		//1.
//	int[] numbers = {1,2,3,4,5,6,7,8,9,10};
	int[] numbers = {};
	
	OptionalDouble average = Arrays.stream(numbers).average();

	if(average.isPresent()) {
		System.out.println("The average is : " + average.getAsDouble());
	}
	else {
		System.out.println("The array is empty");
	}
	
	//
	double average2 = Arrays.stream(numbers).average().orElse(Double.NaN);
    System.out.println("Average is =" + average2);
	
	
	//2. 
	
	List<Integer> num = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
	
	OptionalDouble avg = num.stream()
			             .mapToDouble(Integer::doubleValue)
			             .average();
	
	System.out.println("Average of number = " + avg.getAsDouble());
	
	
	//3.
	double avg1 = num.stream().mapToInt(e->e).average().getAsDouble();
	System.out.println("Averge is = " + avg1);
	
	//4.
	double avg2 = num.stream()
			             .mapToDouble(Integer::doubleValue)
			             .average()
			             .orElse(0.0);
	
	System.out.println("Average of number = " + avg2);
	
	}

}
