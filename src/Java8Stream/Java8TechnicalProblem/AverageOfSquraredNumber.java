package Java8Stream.Java8TechnicalProblem;

import java.util.Arrays;
import java.util.List;

public class AverageOfSquraredNumber {

	public static void main(String[] args) {
		
	//1.
	List<Integer> list = Arrays.asList(1,10,20,15,40);
		
	 double squAvg =  list.stream()
			               .mapToInt(e-> e*e)
			               .average()
			               .orElse(Double.NaN);
	 System.out.println(squAvg);	
	 
	 
	//2. 
	double doubleAvg =  list.stream()
	     .map(e->e*e)
	     .filter(e -> e>100)  //filering number >100 only
	     .filter(e -> e>=500)
	     .mapToInt(e->e)
	     .average()
	     .getAsDouble();
	
	System.out.println(doubleAvg);
	
	
	
	}

}
