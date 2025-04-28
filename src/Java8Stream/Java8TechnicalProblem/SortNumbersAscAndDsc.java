package Java8Stream.Java8TechnicalProblem;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortNumbersAscAndDsc {

	public static void main(String[] args) {
		
	List<Integer> list = Arrays.asList(0,3,10,20,13,4,55,8,2,40,55,87,31,83,15);
	
	//1.Ascending order using Stream:	
	List<Integer> sortedAscOrder = list.stream()
			                          .sorted()
			                          .collect(Collectors.toList())	;
    System.out.println(sortedAscOrder);
    
    //
    List<Integer> sortedAscendingOrder =   list.stream()
  	                                           .sorted((a,b)-> a.compareTo(b))
  	                                           .collect(Collectors.toList());
	System.out.println(sortedAscendingOrder);
  
    //2.Descending order using Stream:
    List<Integer> sortedDescOrder =  list.stream()
		                               .sorted(Collections.reverseOrder())
		                               .collect(Collectors.toList());
	System.out.println(sortedDescOrder);
	
	//4.
	List<Integer> sortedDesendingOrder =   list.stream()
                                             .sorted((a,b)-> b.compareTo(a))
                                                 .collect(Collectors.toList());
    System.out.println(sortedDesendingOrder);
	
	
	
	// Soring string using stream::
    List<String> nameList = Arrays.asList("Geeks", "for", 
            "GeeksQuiz", "GeeksforGeeks", "GFG"); 
    
    //Ascending order:
    nameList.stream().sorted().forEach(System.out::println);
    
    nameList.stream().sorted((a,b) -> a.compareTo(b)).forEach(System.out::println);
    
   
    System.out.println("**************************");
    
    //Descending order::
    nameList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    
    nameList.stream().sorted((a,b) -> b.compareTo(a)).forEach(System.out::println);
    
    System.out.println("**************************");
   
	
	
	}

}
