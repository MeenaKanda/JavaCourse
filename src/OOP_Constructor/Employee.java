package OOP_Constructor;

public class Employee {
	
	//const.. is not a function but it looks like a function
	//const.. is having the same name as class name
	//const.. can not return anything - no return type for const...
	//const.. is helping to control Object creation(purpose of constructor)
	//const.. will be called when you create the object
	//const.. overloading is possible in Java
	//whenever we create the object the respective const.. will be called
	//const.. don't have business logic .while methods hold business logic
	
	//default const...0 param
	public  Employee() {
		System.out.println("default const...");
	}
	
	public Employee(int a) {
		System.out.println("1 param const..." + a);
	}
	
	public Employee(int a, int b) {
		System.out.println("default const..." + (a+b));
	}
	
	
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		
		Employee e2 = new Employee(10);
		
		Employee e3 = new Employee(10, 20);
		

	}

}
