package Encaptulation;

public class Testemp {

	public static void main(String[] args) {

		Employee e1 = new Employee();
		e1.name = "Tom"; // public
		e1.age = 25; // public
		// e1.salary = 90; //private vars can not access from outside the class
		// so through setter method(which is public) we assign the value to private
		// member.

		e1.setSalary(12.33);
		System.out.println(e1.getSalary() + " " + e1.name + " " + e1.age); // 12.33 Tom 25

//		Company c1 = new Company();
//		c1.setName("IBM");
//		c1.setEmpCount(1000);
//		c1.setSharePrice(500);
//		
//		System.out.println(c1.getName());    //IBM
//		System.out.println(c1.getEmpCount()); //1000
//		System.out.println(c1.getSharePrice());//500
//		

		// POST CALL - in API
		Company c1 = new Company("IBM", 1000, 500);

		// GET CALL
		System.out.println(c1.getName()); // IBM
		System.out.println(c1.getEmpCount()); // 1000
		System.out.println(c1.getSharePrice());// 500

		// PUT
		c1.setEmpCount(2000); // update the empcount by 2000 using setter.

		// GET
		System.out.println(c1.getName()); // IBM
		System.out.println(c1.getEmpCount()); // 2000
		System.out.println(c1.getSharePrice());// 500

		// register:
		RegisterPage reg = new RegisterPage("Tom", 25, "Bangalore 566678", "01-01-1996");

		// System.out.println(reg.name);// name is private. so we cant access directly.
		// user getter and setter.

		System.out.println(reg.getName());
		System.out.println(reg.getDob());
		System.out.println(reg.getAdderess()); // Bangalore

		System.out.println("------------------");

		reg.setAdderess("Pune 789650"); // update address value
		System.out.println(reg.getName());
		System.out.println(reg.getDob());
		System.out.println(reg.getAdderess()); // Pune

		RegisterPage reg1 = new RegisterPage("Ravi", 25);
		reg1.setDob("01-01-1997");
		reg1.setAdderess("Delhi");

		System.out.println(reg1.getName()); // Ravi
		System.out.println(reg1.getDob()); // 01-01-1997
		System.out.println(reg1.getAdderess());// delhi
		System.out.println(reg1.getAge()); // 25

		System.out.println("------------------");

		// browser:
		Browser br = new Browser();
		br.launchBrowser();

	}

}
