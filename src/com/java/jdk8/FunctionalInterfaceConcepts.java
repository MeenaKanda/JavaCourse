package com.java.jdk8;

import java.util.function.Function;

public class FunctionalInterfaceConcepts {

	public static void main(String[] args) {
		
		/**
		 * Functional Interface:
           This is a functional interface and can therefore be used as the assignment target for a 
           lambda expression or method reference.   
		 */
		
		Function<String, Integer> func= x->x.length();
		
		int len = func.apply("This is java 8");
		System.out.println(len);
		
		//Chaining Function::
		 
		Function<Integer, Integer> func2 = x->x*2;
		
		int result = func.andThen(func2).apply("This is java 8 Program");
		System.out.println(result);
		
	}

}
