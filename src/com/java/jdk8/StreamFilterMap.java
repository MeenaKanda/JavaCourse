package com.java.jdk8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterMap{
	
	public static void main(String []arg) {
		
		
		List<Customer> cutomerList = Arrays.asList(
				new Customer("Tom", 30),
				new Customer("Steve", 20),
				new Customer("Peter", 36),
				new Customer("Mary", 24),
				new Customer("John", 38)
				);
		//1.
		String name =  cutomerList.stream()
		                    .filter(x -> "Mary".equals(x.getName()))
		                     .map(Customer::getName)
		                     .findAny()
		                      .orElse(null);
		System.out.println(name);
		
		System.out.println("-----------------");
		
		//1.
		String name1 =  cutomerList.stream()
                .filter(x -> "Mary".equals(x.getName()))
                 .map(x-> x.getName())
                 .findAny()
                  .orElse(null);
             System.out.println(name);
             
          System.out.println(" ---------- print all the name from the list  ------------       ");
		
        // print all the name from the list::
         
         List<String> custList = cutomerList.stream()
                                     .map(Customer::getName)
                                     .collect(Collectors.toList());
       custList.forEach(System.out::println);
          
       System.out.println("------or ----------------------");
       
             cutomerList.stream()
                 .map(Customer::getName)
                 .collect(Collectors.toList())
                 .forEach(x->System.out.println(x));
                 //.forEach(System.out::println);
             
             
       
	
	
	}

}
