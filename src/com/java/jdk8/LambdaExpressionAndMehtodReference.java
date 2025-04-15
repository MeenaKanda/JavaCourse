package com.java.jdk8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambdaExpressionAndMehtodReference {

	public static void main(String[] args) {
		
		
		List<String> namesList = Arrays.asList("Tom", "Peter", "Simon", "Naveen");
		
		//1. with Anonymous class::
		namesList.forEach(new Consumer<String>() { //Anonymous Class
		    @Override
			public void accept(String t) {
		    	System.out.println(t);
		    }
		});
		
		System.out.println("------------------------");
		//2. lambda expression::
		
		namesList.forEach(str -> System.out.println(str));
		
		System.out.println("----------------------");
		
		//3.Method Reference::
		namesList.forEach(System.out::println);

}
}