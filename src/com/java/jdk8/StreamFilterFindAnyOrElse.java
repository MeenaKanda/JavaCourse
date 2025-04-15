package com.java.jdk8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterFindAnyOrElse {

	public static void main(String[] args) {
	
		List<Customer> cutomerList = Arrays.asList(
				new Customer("Tom", 30),
				new Customer("Steve", 20),
				new Customer("Peter", 36),
				new Customer("Mary", 24),
				new Customer("John", 38)
				);
		
	
		//1. filter - findAny
	Customer cust = cutomerList.stream()    //convert list into stream
		               .filter(x->(x.getName()).equals("Peter"))  //filter it for peter only
		                .findAny()            //if it finds then return
		                 .orElse(null);
	             
	System.out.println(cust.getName() + "  " + cust.getAge());
	
	System.out.println("------------------------------");
	
	
	
	// 2. filter -- did not findAny() -- orElse
	Customer cust1 = cutomerList.stream()    //convert list into stream
            .filter(x->(x.getName()).equals("Naveen"))  //filter it for Naveen only
             .findAny()            //if it finds then return
             .orElse(null);
      
     System.out.println(cust1);

     System.out.println("------------------------------");

	
	//3. 
	List<Customer> custList =  cutomerList.stream()
	       .filter(x->"Peter".equals(x.getName()))
           .collect(Collectors.toList());
	
	custList.forEach(x -> System.out.println(x.getName() + "  " + x.getAge()));
	
	System.out.println("-------------------------------");
	
	//4. filter with multiple condition::
	
	 Customer cust3  =  cutomerList.stream()
	                             .filter(x -> "Steve".equals(x.getName()) && 20 == (x.getAge()))
	                              .findAny()
	                               .orElse(null);
	            
      System.out.println(cust3.getName() + "   " + cust3.getAge()); 
      
      
      
	
	}	
	}

