package MethodsCalling;

public class User {

	// in order to call the constructor we have to create the object.
	// this keyword used to call the constructor from another const of same class
	// const never stored inside heap or stack.stored inside the class memory.class
	// memory is in the loader memory.
	// JVM initialize the class that time one space will be given to class, const
	// also will be stored there.
	// this keyword->is used to call current class const..
	// super keyword->is used to call parent class const..
	// this keyword -> can not be used in static methods
	// we cannot call more than one const..from another const..because const..call
	// must be in the first statement.

	// super keyword=> is used to call parent class constructor
	// this keyword => is used to call current class constructorS

	// how many use cases of this keyword we have seen:
	// 1.constructor to assign local var to call variable
	// 2.methods - encapsulation - (getter and setter method)
	// 3.builder pattern
	// 4.const is calling another const.. with the help of this keyword and it
	// should be first statement.
	// 5.can be used in method to call another method in the same class.

	String name;
	int age;
	String city;

	/*
	 * public User(String name, int age, String city) { this.name = name; this.age =
	 * age; this.city = city; }
	 * 
	 * public User(String name, int age) { // this(name, age, "Pune"); // this
	 * keyword used to call const(1st const) of same class this("Tom",40, "Pune");
	 * // this.name = name; // this.age = age; }
	 */

	public User(String name, int age, String city) {
		this(city); // calling a const from another const..
		// this("delhi, 40"); //Constructor call must be the first statement in a
		// constructor

		this.name = name;
		this.age = age;
		this.city = city;
	}

	public User(String city) {
		this.city = "Paris";

	}

	public User(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// this keyword in method to call another method:
	public void login() {
		// logout(); // we can do without this also
		this.logout();
		// name = "Tom"
		this.name = "Tom";
	}

	public void logout() {

	}

	public static void main(String[] args) {
		/*
		 * User u1 = new User("Gaurav", 30);
		 * 
		 * System.out.println(u1.name); System.out.println(u1.age);
		 * System.out.println(u1.city);
		 */

		System.out.println("-------------------");

		User u2 = new User("George", 35, "Delhi");

		System.out.println(u2.name);
		System.out.println(u2.age);
		System.out.println(u2.city);

	}

}
