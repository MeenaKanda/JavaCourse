package AssignmentPractice;

public class MethodsCalling {
	
	private String name;
	private int age;
	private int salary;
	private String Company;
	

	public MethodsCalling(String name, int age, int salary, String company) {
		this("Kanda", 42);
		this.name = name;
		this.age = age;
		this.salary = salary;
		Company = company;
		System.out.println(name + age + salary + Company);
	}
	
	
	public MethodsCalling(String name, int age, int salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
		
		System.out.println(name + age + salary + Company);
	}

	public MethodsCalling(String name, int age) {
		this(name, age, 1200000);
		this.name = name;
		this.age = age;
		System.out.println(name + age + salary + Company);
	}


	public static void main(String[] args) {
		

		MethodsCalling m = new MethodsCalling("Meena", 36,100000,"Infy");
		
		System.out.println(m.name + m.age + m.salary + m.Company);
		
	}

}
