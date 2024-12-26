package SeleniumSessions;

public class User {
	
	String name;
	int age;
	String city;
	

	public static void main(String[] args) {
		
		User u1 = new User();
		u1.name = "Ravi";
		u1.age = 25;
		u1.city = "Pune";
		
		User u2 = new User();
		u2.name = "Anjali";
		u2.age = 27;
		u2.city = "LA";
		
		User u3 = new User();
		u3.name = "Kareem";
		u3.age = 38;
		u3.city = "NY";
		
		System.out.println(u1.name + " " + u1.age + " " + u1.city);  //Ravi
		System.out.println(u2.name + " " + u2.age + " " + u2.city);  //Anjali
		System.out.println(u3.name + " " + u3.age + " " + u3.city);  //kareem
		
		System.out.println("**************************");
		
        u1 = u2;  //Ravi(u1) completly out of system now //u1 -> no one refering object
        System.out.println(u1.name + " " + u1.age + " " + u1.city); //Anjali
		System.out.println(u2.name + " " + u2.age + " " + u2.city); //Anjali
		System.out.println(u3.name + " " + u3.age + " " + u3.city); //kareem
		
		System.out.println("**************************");
		u2 = u3;
		System.out.println(u1.name + " " + u1.age + " " + u1.city); //Anjali
		System.out.println(u2.name + " " + u2.age + " " + u2.city); //kareem
		System.out.println(u3.name + " " + u3.age + " " + u3.city); //kareem
		
		System.out.println("**************************");
		
		u3 = u1;
		System.out.println(u1.name + " " + u1.age + " " + u1.city);  //Anjali
		System.out.println(u2.name + " " + u2.age + " " + u2.city);  //kareem		
		System.out.println(u3.name + " " + u3.age + " " + u3.city);  //Anjali
		
		
		int n = 555;
		//int n1 =_5_5_5;
		int n2 = 5_5_5;   //in JDK 1.8 _ is alllowed.  but still integer only 
		System.out.println(n);  //555
		System.out.println(n2); //555
		
	}

}
