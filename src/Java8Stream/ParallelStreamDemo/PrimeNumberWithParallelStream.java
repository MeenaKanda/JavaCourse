package Java8Stream.ParallelStreamDemo;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimeNumberWithParallelStream {

	public static void main(String[] args) {
		
//	System.out.println(isPrime(4));	
	
    long t1,t2;
		
    t1 = System.currentTimeMillis();
	long count = Stream.iterate(0, n->n+1)
	      .limit(500000)
	      .parallel()
	      .filter(PrimeNumberWithParallelStream :: isPrime)
	      .peek(x-> System.out.println(x))
	      .count();
	
	System.out.println("total prime number : " + count);
    t2 = System.currentTimeMillis();
    
    System.out.println("Total time taken : " + (t2-t1)/1000);
	}
	
	
	public static boolean isPrime(int number) {
		if(number<=1) return false;
		
		return !IntStream.range(2, number/2)
				         .anyMatch(x->number%x ==0);
	}

}
