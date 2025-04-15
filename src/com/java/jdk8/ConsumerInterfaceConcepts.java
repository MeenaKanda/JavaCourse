package com.java.jdk8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class ConsumerInterfaceConcepts {
	
	public static void main(String[] args) {
	
	/**
	 * @FunctionalInterface public interface Consumer<T>
        Represents an operation that accepts a single input argument and returns no result. 
        Unlike most other functional interfaces, Consumer is expected to operate via side-effects.
        This is a functional interface whose functional method is accept(Object).
	 */

	Consumer<String> func = x->System.out.println(x);
	func.accept("This java Program");
	
	
	
	List<Integer> numList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
	numList.forEach(x->System.out.println(x));
//	numList.forEach(System.out::println);
	
	
}
}
