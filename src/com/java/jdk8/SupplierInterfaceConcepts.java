package com.java.jdk8;

import java.util.function.Supplier;

public class SupplierInterfaceConcepts {

	public static void main(String[] args) {
		
		/**
		 * @FunctionalInterface public interface Supplier<T>
           Represents a supplier of results.
            There is no requirement that a new or distinct result be returned each time the supplier is invoked.

             This is a functional interface whose functional method is get().
		 */
		
		// supplier -> takes no argument and return a result
		
		getText(() -> "Java");
		getText(() -> "Python");
		
		
	}	
		
		public static void getText(Supplier<String> text) {
			System.out.println(text.get());
		}
		
	

}
