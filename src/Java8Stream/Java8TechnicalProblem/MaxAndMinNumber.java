package Java8Stream.Java8TechnicalProblem;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxAndMinNumber {

	public static void main(String[] args) {
		
	List<Integer> list = Arrays.asList(1,2,5,6,3,9,-5,20,879,40,57,99,3,1,7,8,3);
	
	//Max value:
	int max = list.stream()
			      .max(Comparator.comparing(e -> Integer.valueOf(e)))
			      .get();
	System.out.println(max);	
	
	int max1 = list.stream()
		      .max(Comparator.comparing(Integer::valueOf))
		      .get();
    System.out.println(max1);	
	
    
    //Min value::
    
    int min = list.stream()
            .min(Comparator.comparing(Integer::valueOf))
            .get();
    System.out.println(min);
    	
    int min1 = list.stream()
        .min(Comparator.comparingInt(e->e))
        .get();
    System.out.println(min1);
	
	}
	
	

}
