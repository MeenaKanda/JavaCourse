package LamdaExpression;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee{
	String eName;
	int salary;
	String gender;
	
	public Employee(String eName, int salary, String gender) {
		this.eName = eName;
		this.salary = salary;
		this.gender = gender;
	}
}

public class consumerDemo2 {
	
	public static void main(String[] args) {
		
		ArrayList<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee("Meena", 80000, "Female"));
		empList.add(new Employee("Sam", 50000, "Male"));
		empList.add(new Employee("Mary", 75000, "Female"));
		empList.add(new Employee("John", 55000,"Male"));
		
		//Function 
		Function<Employee, Integer> f = emp->(emp.salary*10/100); //task 1
		
		//Predicate
		Predicate<Integer> p = b->(b>=7000);  //task 2
		
		//Consumer
		Consumer<Employee> c = emp->{       //task 3
			System.out.println(emp.eName);
			System.out.println(emp.salary);
			System.out.println(emp.gender);	
		};
		
		
		for(Employee e : empList) {
			int bonus = f.apply(e);  //Invoked function //calculate bonus
			if(p.test(bonus)) {   //Invoked predicate
				c.accept(e);     //invoked consumer
				System.out.println("Bonus of employee = " + bonus);
			}
		}
		
		
	}

}
