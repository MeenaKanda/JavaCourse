package Java8Stream.FlatMapDemos;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSetWithFlatMap {

	public static void main(String[] args) {

		Employee emp1 = new Employee();
		emp1.setName("Meena");
		
		emp1.addDevices("iphone12");
		emp1.addDevices("samsung10");
		emp1.addDevices("iphone9");
		emp1.addDevices("macbook pro");
		emp1.addDevices("Samsung11");
		
		
		Employee emp2 = new Employee();
		emp2.setName("Kanda");
		
		emp2.addDevices("lenovo Window10");
		emp2.addDevices("samsung10");
		emp2.addDevices("iphone9");
		emp2.addDevices("macbook pro");
		emp2.addDevices("macbook air");
		
		
		List<Employee> empLists = new ArrayList<Employee>();
		
		empLists.add(emp1);
		empLists.add(emp2);
		
		
		List<String> devicesList = empLists.stream() 
				                      .map(x->x.getDevices())   //Stream<Set<String>>
		                               .flatMap(x-> x.stream()) //Stream<String>
		                               .distinct()
		                               .collect(Collectors.toList());
		
		
		devicesList.forEach(System.out::println);
		
		
	}
	
	

}
