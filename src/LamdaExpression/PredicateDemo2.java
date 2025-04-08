package LamdaExpression;

import java.util.ArrayList;
import java.util.function.Predicate;

class employees{
	String eName;
	int salary;
	int experience;
	
	
	public employees(String eName, int salary, int experience) {
		this.eName = eName;
		this.salary = salary;
		this.experience = experience;
	}
	
    
}


public class PredicateDemo2 {

	public static void main(String[] args) {
		
		// Ex:1  lamda expression for 1 employee object
		employees emp = new employees("John", 50000, 5);
		//in Lamda expression => pass Employee as an argument => return name if sal>30k exp>3
		
		Predicate<employees> pr = e->(e.salary>30000 && e.experience>3);
		boolean b = pr.test(emp);
		System.out.println(b);  //true
		
		// Ex :2 for multiple employee object
		ArrayList<employees> empList = new ArrayList<employees>();
		empList.add(new employees("John",50000, 5));
		empList.add(new employees("David",20000, 2));
		empList.add(new employees("Scott",30000, 3));
		empList.add(new employees("Mary",25000, 6));
		empList.add(new employees("Ashley",35000, 4));
		
		for(employees e: empList) {
			if(pr.test(e)) {   //we can write multiple conditon inside lamda exp
	//	    if(e.salary>30000 && e.experience>3) {
				System.out.println(e.eName + "  " + e.salary);
			}
		}

	}

}
