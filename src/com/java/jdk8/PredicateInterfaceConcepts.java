package com.java.jdk8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateInterfaceConcepts {

	public static void main(String[] args) {
		
		/**
		 * @FunctionalInterface public interface Predicate<T>
           Represents a predicate (boolean-valued function) of one argument.
           This is a functional interface whose functional method is test(Object).
		 */
		
		Predicate<Integer> func = x -> x>5;
		
		List<Integer> numList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		List<Integer> collList = numList.stream().filter(func).collect(Collectors.toList());

		System.out.println(collList);
		
		
		//predicate with && operator::
		List<Integer> list = numList.stream().filter(x->x>5 && x<9).collect(Collectors.toList());
	    System.out.println(list);
	    
	   
	    //Predicate with negate()::
	    
	    List<String> nameList = Arrays.asList("Java", "Jav", "Ja", "J", "Ruby", "Rub", "Ru", "R");
	    
	    Predicate<String>  nameExp = x -> x.startsWith("Jav");
	    List<String> result = nameList.stream().filter(nameExp).collect(Collectors.toList());
	    System.out.println(result);
	    
	    List<String> negateresult = nameList.stream().filter(nameExp.negate()).collect(Collectors.toList());
	    System.out.println(negateresult);
	}

}
