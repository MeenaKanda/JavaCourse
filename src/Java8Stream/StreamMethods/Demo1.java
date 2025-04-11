package Java8Stream.StreamMethods;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Demo1 {

	// Non-Terminal methods - distinct() , limit()
	// Terminal Methods - count(), forEach(), reduce(), min(), max()
	public static void main(String[] args) {

		List<String> vehicleList = Arrays.asList("bus","bus","car", "car", "bicycle", "bike","bus", "car");
	
		//
/*	    List<String> distinctVehicle =  vehicleList.stream().distinct().collect(Collectors.toList());
	    System.out.println(distinctVehicle); //[bus, car, bicycle, bike]
*/
		
		vehicleList.stream().distinct().forEach(value->System.out.println(value));
		
		//count()
		long count = vehicleList.stream().distinct().count();
		System.out.println(count);
	    
		//limit()
		List<String> limitedVehicleList = vehicleList.stream().limit(3).collect(Collectors.toList());
	    System.out.println(limitedVehicleList);	 
	    
	    vehicleList.stream().limit(4).forEach(System.out::println);
	    
	    System.out.println("------------");
	    
	    vehicleList.stream().distinct().limit(2).forEach(val->System.out.println(val));
	
	
	   System.out.println("------------------------------------");
	   
	   List<Integer> numberList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
	   
	   //count()
	   long evenNumCount = numberList.stream().filter(num->num%2==0).count();
	   System.out.println(evenNumCount);
	   
	   // min() 
	   
	   Optional<Integer> min = numberList.stream().min((val1,val2)-> {
		                                       return val1.compareTo(val2);
	                                             });
	
	    System.out.println(min.get());
	    
	    //max()
	   Optional<Integer> max =  numberList.stream().max((val1,val2) -> 
	                                  {return val1.compareTo(val2);
	                                  });
	    System.out.println(max.get());
	
	
	    System.out.println("--------------------------");
	    
	    // reduce()
	    
	    List<String> stringList = Arrays.asList("A", "B", "C", "1", "2", "3");
	    Optional<String> reduced =  stringList.stream().reduce((value,combinedvalue)-> {
	    	                                     return combinedvalue+value;
	                                        });
	    
	    System.out.println(reduced.get());
	    
	    
	    System.out.println("---------------------------");
	    
	    //toArray()
	    Object arr[] = stringList.stream().toArray();
	    System.out.println(arr.length);
	    
	    for(Object e : arr) {
	    	System.out.println(e);
	    }
	    
	    
	}
	
	
	

}
 