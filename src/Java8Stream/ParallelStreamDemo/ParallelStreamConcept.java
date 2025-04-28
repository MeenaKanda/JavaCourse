package Java8Stream.ParallelStreamDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.BaseStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ParallelStreamConcept {

	public static void main(String[] args) {
		
	//find How many core on our System	
	ForkJoinPool corePools =  ForkJoinPool.commonPool();
	System.out.println(corePools.getParallelism());  //3
	
	
	//parallel stream -> we use when order doesnt matter
	
	//1. parallel() method on stream::
	
	Stream stream = Stream.of("Meena", "Tom", "Selvin", "Peter", "Raj", "Siman");
	BaseStream parallelStream = stream.parallel();
	
	//sequential execution : execute in sequential order
	Stream.of("Meena", "Tom", "Selvin", "Peter", "Raj", "Siman").forEach(System.out::println);
	
	//parallel execution: execute in random order
	Stream.of("Meena", "Tom", "Selvin", "Peter", "Raj", "Siman").parallel().forEach(System.out::println);
	
	System.out.println("********************************");
	
	//2. use paralleStream() method on a collection stream::
	Arrays.asList("Meena", "Tom", "Selvin", "Peter", "Raj", "Siman").parallelStream().forEach(System.out::println);
	
	//print 1 to 10
	System.out.println("---- normal/sequential Stram ------");
	IntStream.rangeClosed(1, 10).forEach(System.out::println);
	
	System.out.println("---- parallel stream--------");
	IntStream.rangeClosed(1, 10).parallel().forEach(System.out::println);
	
	// print from a - z   ---> 97 - 122
	
	System.out.println("-------------------------------");
	
	System.out.println(getAlphabetList());
	
	System.out.println("--------normal stream--------");
	getAlphabetList().stream().forEach(System.out::println);
	
	System.out.println("-----parallel stream -----------");
	getAlphabetList().parallelStream().forEach(System.out::println);
	

	//check stream is running in parallel mode:: isParallel() method
	
	IntStream range = IntStream.rangeClosed(1, 10);
	System.out.println(range.isParallel());  //false
	
	IntStream range1 = IntStream.rangeClosed(1, 10);
	range1.parallel();
	System.out.println(range1.isParallel()); //true
	
	

	
	

	
	}
	
	
	public static List<String> getAlphabetList() {
		List<String> alpha = new ArrayList<String>();
		
		int n=97;
		while(n<=122) {
			char c = (char)n;
			alpha.add(String.valueOf(c));
			n++;
		}
		return alpha;	
	}

}
