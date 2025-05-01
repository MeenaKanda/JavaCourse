package JavaProjects.LibraryManagementSystem;

import java.util.Scanner;

public class Student {
	
	//Program to illustrate Student Class
	//to take input from student and related information
	
	String studentName;
	String regNum;
	
	Book borrowedBooks[] = new Book[3];
	public int booksCount = 0;
	
	//Scanner Class to take input from Student
	Scanner input = new Scanner(System.in);
	
	//Constructor
	public Student() {
		System.out.println("Enter Student Name ");
		
		
		
		this.studentName = input.nextLine();
		//input.nextLine();
		System.out.println("Value is :: " + this.studentName);
		
		System.out.println("Enter Student Registration Number");
		
		
		this.regNum = input.nextLine();
		//input.nextLine();
		System.out.println("Value of reg numbr is :: " + this.regNum);
		
	}

}
