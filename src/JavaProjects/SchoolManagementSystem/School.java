package JavaProjects.SchoolManagementSystem;

import java.util.ArrayList;

public class School {
	
	private ArrayList<Student> students;
	private ArrayList<Teacher> teachers;
	private ArrayList<SchoolClass> classes;

	public School() {
		this.students = new ArrayList<Student>();
		this.teachers = new ArrayList<Teacher>();
		this.classes =  new ArrayList<SchoolClass>();
		}

	public ArrayList<Student> getStudents() {
		return students;
	}

	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}

	public ArrayList<Teacher> getTeachers() {
		return teachers;
	}

	public void setTeachers(ArrayList<Teacher> teachers) {
		this.teachers = teachers;
	}

	public ArrayList<SchoolClass> getClasses() {
		return classes;
	}

	public void setClasses(ArrayList<SchoolClass> classes) {
		this.classes = classes;
	}
	
	public void addStudent(Student student) {
		students.add(student);
	}
	
	public void removeStudent(Student student) {
		students.remove(student);
	}
	
	public void addTeacher(Teacher teacher) {
		teachers.add(teacher);
	}
	
	public void removeTeacher(Teacher teacher) {
		teachers.remove(teacher);
	}
	
	public void addClasses(SchoolClass className) {
	    classes.add(className);
	}

    public void removeClasses(SchoolClass className) {
    	classes.remove(className);
    }
}
