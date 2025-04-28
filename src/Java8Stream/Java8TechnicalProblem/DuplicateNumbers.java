package Java8Stream.Java8TechnicalProblem;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateNumbers {

	public static void main(String[] args) {

		// 1.using frequency() method

		List<Integer> list = Arrays.asList(1, 2, 3, 10, 3, 1, 30, 19, 22, 3, 44, 11);

		Set<Integer> dup = list.stream()
				               .filter(e -> Collections.frequency(list, e) > 1)
				               .collect(Collectors.toSet());

		System.out.println(dup);
		
		//2.
		Set<Integer> dupNum = new HashSet<Integer>();
		
		Set<Integer> dupNumber = list.stream().filter(e-> !dupNum.add(e))
		    .collect(Collectors.toSet());
		
		System.out.println(dupNumber);
		
		
		
		

	}

}
