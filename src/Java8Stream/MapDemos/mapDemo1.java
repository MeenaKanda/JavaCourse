package Java8Stream.MapDemos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class mapDemo1 {

	public static void main(String[] args) {
		
		List<String> vehicles = Arrays.asList("bus", "car","bicycle", "flight", "train");
		
		List<String> UpVehicleList = new ArrayList<String>();
		
		//without using stream 
/*		for(String name : vehicles) {
			UpVehicleList.add(name.toUpperCase());
		}
		System.out.println(UpVehicleList);
*/		
		//with Stream - Map
		
		UpVehicleList= vehicles.stream().map(name-> name.toUpperCase()).collect(Collectors.toList());
		System.out.println(UpVehicleList);
		
		
		
		//find length of element in the list
		
		//without using stream
/*		for(String name: vehicles) {
			System.out.println(name.length());
		}
*/		
		//with Stream -Map
		
//		vehicles.stream().map(veh->veh.length()).forEach(len->System.out.println(len));
		vehicles.stream().map(veh->veh.length()).forEach(System.out::println);

		
		System.out.println("----------------------------");
		
		// ------------------------------------------
		List<Integer> numberList = Arrays.asList(2,3,4,5,6,7,8);
		
		List<Integer> multipliedList = new ArrayList<Integer>();
		
		//with Stream - Map
/*		multipliedList = numberList.stream().map(n-> n*3).collect(Collectors.toList());
	    System.out.println(multipliedList);
*/	    
//	   numberList.stream().map(n-> n*3).forEach(num->System.out.println(num));
	   numberList.stream().map(n-> n*3).forEach(System.out::println);

	    
	}

}
