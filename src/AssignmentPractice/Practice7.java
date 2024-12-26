package AssignmentPractice;
//call by reference
public class Practice7 {
	
	
	String name;
	int age;
	int height;
	String color;
	
	
	public void callName(Practice7 emp) {
		this.name = "Meena";
		this.age = 36;
		this.color= "light brown";
		
		System.out.println("name: " +emp. name + " " + "age: " +emp. age + "color: " + emp.color );
		
	}

	public static void main(String[] args) {
		
		Practice7 p1 = new Practice7();
		System.out.println("name: " +p1. name + " " + "age: " +p1. age + "color: " + p1.color );
		
		p1.callName(p1);
		
		
		System.out.println("name: " +p1. name + " " + "age: " +p1. age + "color: " + p1.color );
		
		p1.name = "Kanda";
		p1.age =42;
		p1.color = "light";
		
		System.out.println("************************");
		System.out.println("name: " +p1. name + " " + "age: " +p1. age + "color: " + p1.color );

	}

}
