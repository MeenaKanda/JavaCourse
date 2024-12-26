package AssignmentPractice;

public class HW1 {
	
/*	private String name;
	private double version;
	private String plugin;
	
	public HW1(String name, double version, String plugin) {
		this.name = name;
		this.version = version;
		this.plugin = plugin;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public double getVersion() {
		return version;
	}


	public void setVersion(double version) {
		this.version = version;
	}

	public String getPlugin() {
		return plugin;
	}

	public void setPlugin(String plugin) {
		this.plugin = plugin;
	}
      */
	
	
	private String name;
	private int age;
	private int salary;
	private boolean isActive;
	private String gender;
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}


	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void getEmployeeInfo() {
		System.out.println(getName());
		System.out.println(getAge());
		System.out.println(getSalary());
		System.out.println(isActive());
		System.out.println(getGender());
		
	}
	
	public static void main(String[] args) {

	}

}
