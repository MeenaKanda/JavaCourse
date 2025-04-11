package Java8Stream.MapDemos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employees {
	int empid;
	String empName;
	int salary;
	
	
	public Employees(int empid, String empName, int salary) {
		this.empid = empid;
		this.empName = empName;
		this.salary = salary;
	}
}



public class filerMapDemo {

	public static void main(String[] args) {
		
		List<Employees> employeeList = Arrays.asList(
				                       new Employees(101, "Alex", 10000),
				                       new Employees(102, "Brad", 20000),
				                       new Employees(103, "Charles", 25000),
				                       new Employees(104, "Brad", 40000),
				                       new Employees(105, "Brad", 35000));
		
		
	List<Integer> employeeSalList =	employeeList.stream()
		         .filter(emp->emp.salary>20000)
		          .map(emp->emp.salary)
		          .collect(Collectors.toList());
		
	System.out.println(employeeSalList);
	}

}
