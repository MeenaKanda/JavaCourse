package Java8Stream.ParallelStreamDemo;

import java.util.Arrays;
import java.util.List;

class Student{
	String name;
	int score;

	
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getScore() {
		return this.score;
	}
	
}

public class Demo1 {

	public static void main(String[] args) {
		
		List<Student> studentList = Arrays.asList(
				new Student("David", 90),
				new Student("Bob", 80),
				new Student("John", 65),
				new Student("Kennedy", 55),
				new Student("Eric", 85),
				new Student("Smith", 99),
				new Student("Scott", 88),
				new Student("Tim", 75)
				);
				
		// using stream()  - sequential 
		studentList.stream()
		                  .filter(stu->stu.score>80)
		                  .limit(3)
		                  .forEach(stu->System.out.println(stu.getName() + "  " + stu.getScore()));
	
	
		
		// using Parallel Stream()
		studentList.parallelStream()
        .filter(stu->stu.score>80)
        .limit(3)
        .forEach(stu->System.out.println(stu.getName() + "  " + stu.getScore()));

	
		//convert stream() to ParallelStream()
		
		studentList.stream().parallel()
        .filter(stu->stu.score>80)
        .limit(3)
        .forEach(stu->System.out.println(stu.getName() + "  " + stu.getScore()));

	}

}
