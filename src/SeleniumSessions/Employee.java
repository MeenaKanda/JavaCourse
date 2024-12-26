package SeleniumSessions;

public class Employee {
	
	//class : category of Object, blueprint/template of Objects
	//Object : is the physical entity
	
	//class vars:(template variable and is given to each and every Objects)
	//String name = "Naveen";  //we avoid give value to class variable

	String name;        // we just declare variable
	int age;
	String city;
	double salary;
	

	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		
		e1.name = "Tom";
		e1.age = 25;
		e1.city = "LA";
		e1.salary = 12.33;
		
		System.out.println(e1.name + " " + e1.age + " " + e1.city + " " + e1.salary );
		
		//
		Employee e2 = new Employee();  //without assign value to class vars
		System.out.println(e2.name);  //null
		System.out.println(e2.age);   //0
		System.out.println(e2.salary);  //0.0

		//
/*		Employee e3 = new Employee();
		e3 = null; //now e3 is not pointing Object. it pointing to null    
		// this type of Object is called Null reference Object
		e3.name = "Naveen"; */  //NPE
		// whenever apply any method or variables on null , it start giving Null pointer exception
		
		new Employee();  //this is called no reference object
		// not good idea create without create ref variable name
		new Employee().name = "Naveen";  //this is new object
		new Employee().age = 25;         //this is one more new object
		
		
	}

}


