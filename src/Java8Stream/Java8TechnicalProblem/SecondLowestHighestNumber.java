package Java8Stream.Java8TechnicalProblem;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondLowestHighestNumber {

	public static void main(String[] args) {
		
	List<Integer> list = Arrays.asList(0,3,7,2,9,10,55,40,2,78,99,36,5,24);
	
	//second Highest Number::
	int secondHigestNum =  list.stream().sorted(Collections.reverseOrder()).distinct().limit(2).skip(1).findFirst().get();
	System.out.println(secondHigestNum);
	
	int secHigestNumlist = list.stream().sorted(Collections.reverseOrder()).distinct().skip(1).findFirst().get();
	System.out.println(secHigestNumlist);
	
	
	//second lowest Number:
	int secondLowestNumner = list.stream().sorted().distinct().skip(1).findFirst().get();
	System.out.println(secondLowestNumner);
	}

}
