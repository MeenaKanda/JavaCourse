package com.java.jdk8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsFilterCollect {

	public static void main(String[] args) {
		
		List<String> productList = Arrays.asList("Macbook", "iphone", "Shoes", "Battery Charger", "Bat");
		
		System.out.println(productList);  //or
		productList.forEach(ele-> System.out.println(ele)); //or 
		productList.forEach(System.out::println);
		
		System.out.println("--------------");
		List<String> result = productList.stream().filter(ele -> ! ele.equals("Shoes")).collect(Collectors.toList());
		result.forEach(ele->System.out.println(ele)); //or
		//System.out.println(result);  //or
		//result.forEach(System.out::println); 
		               
	}

}
