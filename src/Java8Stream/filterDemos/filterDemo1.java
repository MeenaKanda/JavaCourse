package Java8Stream.filterDemos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class filterDemo1 {

	public static void main(String[] args) {
		
	/*	ArrayList<Integer> numbersList = new ArrayList<Integer>();
	    numbersList.add(10);
	    numbersList.add(15);
	    numbersList.add(20);
	    numbersList.add(25);
	    numbersList.add(30);
	    System.out.println(numbersList);
	*/
		
		
	List<Integer> numberList = Arrays.asList(10,15,20,25,30,35);
	
	List<Integer> evenNumberList = new ArrayList<Integer>();
	
	//without using stream::
/*	for(int n: numberList) {
		if(n%2==0) {
			evenNumberList.add(n);
		}
	}
	System.out.println(evenNumberList);
*/	
	
	//with Stream concepts::
/*	evenNumberList = numberList.stream().filter(n->n%2==0).collect(Collectors.toList()); //filter taking predicate 
	System.out.println(evenNumberList);
*/	

//	numberList.stream().filter(n->n%2==0).forEach(n->System.out.println(n)); //forEach take consumer
	numberList.stream().filter(n->n%2==0).forEach(System.out::println);
	}

}
