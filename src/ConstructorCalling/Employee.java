package ConstructorCalling;

public class Employee {
	
	//this() => keyword is used to call the one constructor from another constructor from the same class.
	//constructor calling must be first statement of constructor.

	String name;
	int age;
	String city;
	
	public Employee() {
		this("Ravi", 30);
		System.out.println("Hi emp");
	}

	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Employee(String name, int age, String city) {
		this.name = name;
		this.age = age;
		this.city = city;
	}

	public Employee(String name) {
		this("Robin", 40, "WA");  //cons calling should be first statement. 
//		this();
		this.name = name;
		this.age = 60;
		this.city = "LA";
		
	}
	
}
