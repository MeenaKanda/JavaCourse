package JavaProjects.SchoolManagementSystem;

public class Student {
	
	private String StudentName;
	private int age;
	
	
	
	public Student(String studentName, int age) {
		StudentName = studentName;
		this.age = age;
	}

	public String getStudentName() {
		return StudentName;
	}

	public void setStudentName(String studentName) {
		StudentName = studentName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
    
	
	
	
}
