package AssignmentPractice;

public class T {

	public static void main(String[] args) {
		
        GetterSetter gs = new GetterSetter("Tanish", 7, 500000000,"Google");
		
		gs.getName();
		gs.getAge();
		gs.getSalary();
		gs.getCompany();
		
        System.out.println(gs.getName() + gs.getAge() + gs.getSalary() + gs.getCompany() );
        
        gs.setAge(20);
        System.out.println(gs.getName() + gs.getAge() + gs.getSalary() + gs.getCompany() );
        
        gs.setName("Sammu");
        System.out.println(gs.getName() + gs.getAge() + gs.getSalary() + gs.getCompany() );
	}

}
