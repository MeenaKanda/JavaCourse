package JavaProjects.SchoolManagementSystem;

import java.lang.classfile.attribute.InnerClassesAttribute;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		
		School school = new School();
		
		Student student1 = new Student("Meena", 14);
		Student student2 = new Student("Kanda", 15);
		Student student3 = new Student("Sammu", 14);
		Student student4 = new Student("Tanish", 13);
		Student student5 = new Student("Balu", 15);
		
		school.addStudent(student1);
		school.addStudent(student2);
		school.addStudent(student3);
		school.addStudent(student4);
		school.addStudent(student5);
		
		System.out.println( school.getStudents().stream().map(e -> e.getStudentName()).collect(Collectors.toList()));
		
		Teacher teacher1 = new Teacher("Stella", "Math");
		Teacher teacher2 = new Teacher("Josh", "Science");
		Teacher teacher3 = new Teacher("Marry", "English");
		Teacher teacher4 = new Teacher("Daniel", "Social");
		
		school.addTeacher(teacher1);
		school.addTeacher(teacher3);
		school.addTeacher(teacher2);
		school.addTeacher(teacher4);
		
		school.getTeachers().stream().map(e-> e.getTeacherName()).forEach(System.out::println);
		school.getTeachers().stream().map(e-> e.getSubject()).forEach(System.out::println);
		
		
		
		SchoolClass mathClass = new SchoolClass("Math", teacher1);
		SchoolClass scienceClass = new SchoolClass("Science", teacher2);
		SchoolClass englishClass = new SchoolClass("English", teacher3);
		SchoolClass socialClass = new SchoolClass("SocialScience", teacher4);
		
		school.addClasses(mathClass);
		school.addClasses(scienceClass);
		school.addClasses(englishClass);
		school.addClasses(socialClass);
		
		mathClass.addStudent(student1);
		mathClass.addStudent(student2);
		mathClass.addStudent(student3);
		mathClass.addStudent(student4);
		
		scienceClass.addStudent(student2);
		scienceClass.addStudent(student1);
		scienceClass.addStudent(student4);
		
		englishClass.addStudent(student3);
		englishClass.addStudent(student1);
		
		socialClass.addStudent(student4);
		
		school.getClasses().stream().map(e-> e.getClassName()).forEach(System.out::println);
		
		
		System.out.println("***************************");
		
		System.out.println( school.getStudents().stream().map(e -> e.getStudentName()).collect(Collectors.toList()));
		school.getTeachers().stream().map(e-> e.getTeacherName()).forEach(System.out::println);
		school.getClasses().stream().map(e-> e.getClassName()).forEach(System.out::println);
		
		
		System.out.println("------------------------");
		
	
		
		System.out.println("******   Math class information  ******");
		//Math class information::
		System.out.println("Class Name :: " + mathClass.getClassName());
		System.out.println("Teacher Name :: " + mathClass.getTeacher().getTeacherName());
		System.out.println("Number of Students :: " + mathClass.getStudents().size());
		
		System.out.println("********  Science class information *********");
		
		//Science class information::
		System.out.println("Class Name :: " + scienceClass.getClassName());
		System.out.println("Teacher Name :: " + scienceClass.getTeacher().getTeacherName());
		System.out.println("Subject Name :: " + scienceClass.getTeacher().getSubject());
		System.out.println("Number of Students :: " + scienceClass.getStudents().size());
		
		System.out.println(" --------- After Removing ---------------");
		
		school.removeStudent(student1);
		school.removeTeacher(teacher2);
		school.removeClasses(englishClass);
		
		System.out.println( school.getStudents().stream().map(e -> e.getStudentName()).collect(Collectors.toList()));
		school.getTeachers().stream().map(e-> e.getTeacherName()).forEach(System.out::println);
		school.getClasses().stream().map(e-> e.getClassName()).forEach(System.out::println);
		
		System.out.println(" ------ After Remvoing Math Student ------------");
		mathClass.removeStudent(student4);
		
		//Math class information::
		System.out.println("Class Name :: " + mathClass.getClassName());
		System.out.println("Teacher Name :: " + mathClass.getTeacher().getTeacherName());
		System.out.println("Number of Students :: " + mathClass.getStudents().size());
		
		
	}

}
