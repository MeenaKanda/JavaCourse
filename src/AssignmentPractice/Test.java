package AssignmentPractice;

public class Test {

	public static void main(String[] args) {
		
//		Practice5 t = new Practice5("Laksh", 30, "Tcs", 50000);
	
		Practice5 t = new Practice5();
		
		t.setName("Meena");
		t.setAge(36);
		t.setComp("Amazon");
		t.setSalary(100000);
		
		System.out.println(t.getName());
		System.out.println(t.getAge());
		System.out.println(t.getComp());
		System.out.println(t.getSalary());
		
		System.out.println(t.name);
		System.out.println(Practice5.comp);
		
		t.setAge(88);
		t.setSalary(75000);
		t.setComp("Google");
		t.setName("Meenakshi");
		
		System.out.println(t.getAge());
		System.out.println(t.getSalary());
		System.out.println(t.getComp());
		System.out.println(t.getName());
		
		System.out.println("------------------");
		t.publicmethodA();
		
		
		GetterSetter gs = new GetterSetter("Tanish", 7, 500000000,"Google");
		
		gs.getName();
		gs.getAge();
		gs.getSalary();
		gs.getCompany();
	}

}
