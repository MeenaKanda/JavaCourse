package Java8Stream.Java8TechnicalProblem;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberStartsWith {

	public static void main(String[] args) {
		
	List<Integer> numbers = Arrays.asList(2,345,222,178,269,260,023,666);
	
	//1.
	List<Integer> numWith2 = numbers.stream()
	       .map(e-> String.valueOf(e))
	       .filter(e-> e.startsWith("2"))
	      // .map(Integer::valueOf)
	       .map(e-> Integer.valueOf(e))
	       .collect(Collectors.toList());

	System.out.println(numWith2);
	
	//2.
	List<Integer> numlist = numbers.stream()
	       .filter(e -> e.toString().startsWith("2"))
	       .collect(Collectors.toList());
	System.out.println(numlist);
	
	
	//
List<Integer> num =	numbers.stream()
    .filter(e -> e.toString().startsWith("2"))
    .map(e->Integer.valueOf(e))
    .collect(Collectors.toList());

System.out.println(num);
	
	
	
	
	}

}
