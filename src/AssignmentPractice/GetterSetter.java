package AssignmentPractice;

public class GetterSetter {

	private String name;
	private int age;
	private int salary;
	private String company;

	public GetterSetter(String name, int age, int salary, String company) {
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.company = company;
	}

	public GetterSetter(String name, int age, int salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public GetterSetter(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getSalary() {
		return salary;
	}

	public String getCompany() {
		return company;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public void setCompany(String company) {
		this.company = company;
	}
	
}
