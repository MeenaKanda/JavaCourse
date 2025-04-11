package Java8Stream.filterDemos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class filterDemo2 {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Meenakshi", "Tom", "Jon", "Ashley", "Kandaswamy");
		
		List<String> longName = new ArrayList<String>();
		
/*		longName = names.stream().filter(str-> str.length()>5 && str.length()<8).collect(Collectors.toList());
	    System.out.println(longName);
*/	    
	  //names.stream().filter(str-> str.length()>5 && str.length()<8).forEach(str->System.out.println(str));
	    
		names.stream().filter(str->str.length()>5 && str.length()<8).forEach(System.out::println);
	}

}
