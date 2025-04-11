package Java8Stream.StreamMethods;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo2 {

	public static void main(String[] args) {
		
		//sorted
		
		List<Integer> list1 = Arrays.asList(2,4,1,3,7,5,9);
		
		//sorted()
		List<Integer> sortedList = list1.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedList);
        
        //reverse the list
        List<Integer> reverseSortedList =  list1.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
	    System.out.println(reverseSortedList);
	    
	    
	    //sorted() string
	    
	    List<String> list2 = Arrays.asList("John", "Mary", "Kim","David", "Smith");
	    
	    List<String> sortedList2 =  list2.stream().sorted().collect(Collectors.toList());
	    System.out.println(sortedList2);
	    
	    //reverse the string list
	    List<String> reverseSortedList2 = list2.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
	    System.out.println(reverseSortedList2);
	    
	    
	    System.out.println("------------------------------");
	    
	    //anyMatch()
	    //allMatch()
	    //noneMatch()
	   
	    Set<String> fruits = new HashSet<String>();
	    
	    fruits.add("One apple");
	    fruits.add("One mango");
	    fruits.add("Two apples");
	    fruits.add("More grapes");
	    fruits.add("Two guavas");
	    
	    //anyMatch() => take boolean/predicate as an parameter and return boolean
	    //it return true if it is satisfied with any of the value
	    
	    boolean result = fruits.stream().anyMatch(value-> {return value.startsWith("One");});
	    System.out.println(result);
	    
	    //allMatch() => return true if all the value should satisfied the condition
	    
	    boolean result1 = fruits.stream().allMatch(value-> {return value.startsWith("One");});
	    System.out.println(result1);
	    
	    //noneMatch() => return true if all the element should not match with the condition
	    boolean result2 = fruits.stream().noneMatch(value-> {return value.startsWith("One");});
	    System.out.println(result2);
	    
	    
	    
	   System.out.println("--------------------------------");
	   
	   //findAny() => will find any element from the stream.
	   //findFirst() => will return first element from the stream

	   List<String> stringList = Arrays.asList("one", "two", "three", "one");
	   List<String> stringEmptyList = Arrays.asList();
	   
	   //findAny()
	   Optional<String> ele = stringList.stream().findAny();
	   System.out.println(ele.get());
/*	   
	   Optional<String> emptyEle = stringEmptyList.stream().findAny();
	   System.out.println(emptyEle.get());  //java.util.NoSuchElementException:
*/	   
	   //findFirst()
	   Optional<String> firstEle = stringList.stream().findFirst();
	   System.out.println(firstEle.get());
/*	   
	   Optional<String> firstEmptyEle = stringEmptyList.stream().findFirst();
	   System.out.println(firstEmptyEle.get()); //java.util.NoSuchElementException:
	  
*/	   
	   
	 System.out.println("-------------------");  
	   
	 //concatenate Strings
	 
	 List<String> animalsList = Arrays.asList("Dog", "Cat", "Elephant");
	 List<String> birdsList = Arrays.asList("Peacock", "parrot", "crow");
	 
	 Stream<String> stream1 = animalsList.stream();
	 Stream<String> stream2 = birdsList.stream();
	 
	 List<String> finalList = Stream.concat(stream1, stream2).collect(Collectors.toList());
	 
	 System.out.println(finalList);
	   
	}

}
