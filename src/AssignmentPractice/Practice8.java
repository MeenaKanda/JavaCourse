package AssignmentPractice;

public class Practice8 {

	String name;
	int age;
	String city;
	int salary;
	
	
	public Practice8(String name, int age, String city, int salary) {
		
//		this("Kanda", 42 , 800000);
//		this.name = name;
//		this.age = age;
//		this.city = city;
//		this.salary = salary;
		System.out.println("name: " + name + " age: " + age + " city: " + city + " salary: " + salary);
	}
	
	public Practice8(String name, int age, int salary) {
		this("kanda", 42, "redmond", 800000);
		this.name = name;
		this.age = age;
		this.salary = salary;
		System.out.println(name + age + salary +city);
	}

	public Practice8(String name, int age) {
	    this.name = name;
		this.age = age;
	}

	public static void main(String[] args) {
		
		Practice8 a = new Practice8("Meena",36,2000000 );
		
		System.out.println(a.name);
		System.out.println(a.age);
		System.out.println(a.city);
		System.out.println(a.salary);

	}

}
