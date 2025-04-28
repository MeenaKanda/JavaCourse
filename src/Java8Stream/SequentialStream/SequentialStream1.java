package Java8Stream.SequentialStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SequentialStream1 {

	public static void main(String[] args) {
		
		
		//1.
		Stream stream = Stream.of("Meena","Tom", "Jerry", "John", "peter");
	//	stream.forEach(System.out::println);  //stream is closed
		stream.findFirst().ifPresent(System.out::println);
		
		
		//2.
		Arrays.asList("a1", "a2", "a3", "a4")
		      .stream().findAny()
		      .ifPresent(System.out::println);
		
		//3.
		
		IntStream.range(1,5).forEach(System.out::println);
		
		IntStream.rangeClosed(1, 15).forEach(x->System.out.println(x));
		
		long count = IntStream.rangeClosed(10, 22).count();
		System.out.println(count);
		
		int[] arr = new int[] {22,33,55,22,44,66,44,77};
 		Arrays.stream(arr)   //create Intarray
 		      .distinct().forEach(System.out::println); 
 		
 		System.out.println("************************");
 		
 		//4. 
 		Arrays.stream(new int[] {1,2,3,4,5})    //Intstream created
 		      .map(n->n*2+1)
 		      .average()
 		      .ifPresent(System.out::println);
 		
 		
 		//5.String date Object:
 		
 		Stream.of("a1","a2","a3","a759")
 		      .map(s-> s.substring(1))  //getting from index 1 value is still string
 		      .mapToInt(Integer::parseInt) //convert string to integer
 		      .max()
 		      .ifPresent(System.out::println);
 		
 		
 		//6. doubles to String objects::
 		Stream.of(1.0, 2.0, 3.0)
 		      .mapToInt(Double::intValue)
 		      .mapToObj(i-> "a" + i)
 		      .forEach(System.out::println);
 		
 		
 		//7.limit::
 		Stream.iterate(0, n->n+1).limit(10).forEach(System.out::println);
 		
 		//printing first 10 odd numbers
 		Stream.iterate(0, n->n+1)
 		       .filter(n-> n%2!=0)
 		       .limit(10)
 		       .forEach(System.out::println);
 		       
 		
 		
 			
		
		     
		     
		
		
		

		
		
		
		
	}

}
