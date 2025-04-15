package com.java.jdk8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnaryOperatorInterfaceConcepts {

	public static void main(String[] args) {
		
		/**
		 * @FunctionalInterface public interface UnaryOperator<T> extends Function<T,T>
		 * Represents an operation on a single operand that produces a result of the same type as its operand. 
		 * This is a specialization of Function for the case where the operand and result are of the same type.
           This is a functional interface whose functional method is Function.apply(Object). 
		 */

		//Unary Operator::
		UnaryOperator<Integer> func = x->x*7;
		int n1 = func.apply(10);
		System.out.println(n1);
		
		// Function Interface::
        Function<Integer, Integer> func1 = x->x*7;
		
		int n2 = func.apply(10);
		System.out.println(n2);
		
		
		List<String> langList = Arrays.asList("Java", "Ruby", "Python");
		System.out.println(langList);
		
		langList.replaceAll(ele -> ele + " Program");  //replaceAll Accept Unary Operator as an argument
		System.out.println(langList);
		
	}

}
