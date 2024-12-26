package Encaptulation;

public class Employee {

	public String name;
	public int age;
	private double salary;

	// public getter and setter method : always prefer for private members.not public

	public double getSalary() { 
		return salary;
	}

	public void setSalary(double salary) { 
		this.salary = salary;
	}

	
	  public static void main(String[] args) { 
		  Employee e1 = new Employee();
	  
	  e1.name = "Tom"; //public 
	  e1.age = 25; //public 
	  e1.salary = 90; //private
	 // property can accessed only from same class. not outside of class
	  System.out.println(e1.name); //tom 
	  System.out.println(e1.getSalary()); //90 
	  }
}
