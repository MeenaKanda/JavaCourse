package AssignmentPractice;

public class TestClass {

	public static void main(String[] args) {
		
/*		HW1 t = new HW1("Google",10.2,"plugion" );
		
		System.out.println(t.getName());
		System.out.println(t.getVersion());
		System.out.println(t.getPlugin());
		
		t.setName("firefox");
		t.setVersion(12.2);
		
        System.out.println("-----------------");
        
		System.out.println(t.getName());
		System.out.println(t.getVersion());
		System.out.println(t.getPlugin());
		
             */
		
		HW1 t1 = new HW1();
		
		t1.setName("Meena");
		t1.setAge(36);
		t1.setGender("female");
		t1.setActive(true);
		t1.setSalary(5000);
		
		t1.getEmployeeInfo();
	}

}
