package JavaProjects.LibraryManagementSystem;

import java.util.Scanner;

public class Students {
	// Java program to illustrate students class
	// To do all the operations related to students:
	//add Students, check-in books, check out books, ValidStudent
	

	Scanner input = new Scanner(System.in);
	Student theStudents[] = new Student[50];
	
	public static int count = 0;
	
	
	//Method 1 
	//To add books
	
	public void addStudent(Student s) {
		
		for(int i=0; i<count; i++) {
			if(s.regNum.equalsIgnoreCase
					(theStudents[i].regNum)) {
				System.out.println("Student of Reg No " +s.regNum + " is Already Registered.");
			    return;
			}
			
			if(count<=50) {
				theStudents[count] = s;
				count++;
			}
		}
	}
	
	
	//Method 2
	//Display all students
	public void showAllStudents() {
		System.out.println("Student Name\t\t\tReg Number\n");
		System.out.println("Value of Student count is:: " + count);
		
		for(int i=0; i< count; i++) {
			System.out.println(theStudents[i].studentName 
					              + "\t\t" 
		                          + theStudents[i].regNum  );
		}
		
	}
	
	
	//Method 3
	// To Check the student
	public int isStudent() {
		System.out.println("Enter Registration Number");
		
		String regNumber = input.nextLine();
		
		for(int i=0; i<count; i++) {
			if(theStudents[i].regNum.equalsIgnoreCase(regNumber)) {
				return i;
			}
		}
		
		System.out.println("Student is not Registered");
		System.out.println("Get Registered First");
		return -1;
		
	}
	
	//Method 4
	// To remove the book when check out
	
	public void checkOutBook(Books book) {
		
		int studentIndex = this.isStudent();
		
		if(studentIndex != -1) {
			System.out.println("Checking out");
			
			book.showAllBooks();
			Book b = book.checkOutBook();
			
			System.out.println("Checking out");
			
			if(b != null) {
				
				if(theStudents[studentIndex].booksCount <=3) {
					System.out.println("adding book");
					
					theStudents[studentIndex].
					borrowedBooks[theStudents[studentIndex].booksCount] = b;
					
					theStudents[studentIndex].booksCount++;
					return;
				}
				else {
					System.out.println("Student can noyt borrow more than 3 Books");
					return;
				}
			}
			System.out.println("Book is not Available");
			
		}
	}
	
	
	//Method 5
	//To add the book
	public void checkInBook(Books book) {
		int studentIndex = this.isStudent();
		
		if(studentIndex != -1) {
			// Printing credentials corresponding to student
            System.out.println("S.No\t\t\tBook Name\t\t\tAuthor Name");
            
           Student s =  theStudents[studentIndex];
           
           for(int i=0; i<s.booksCount; i++) {
        	   System.out.println(s.borrowedBooks[i].sNo + "\t\t"
        			              + s.borrowedBooks[i].bookName + "\t\t"
        			              + s.borrowedBooks[i].authorName);
           }
           
           //Display message only
           System.out.println("Enter Serial Number of book to be Checked in : ");
		      int sNo = input.nextInt();
		      
		      for(int i=0; i<s.booksCount; i++) {
		    	  if(sNo == s.borrowedBooks[i].sNo) {
		    		  book.checkInBook(s.borrowedBooks[i]);
		    		  s.borrowedBooks[i] = null;
		    		  return;  
		    	  }
		      }
		      System.out.println("Book of Serial No " + sNo + " not Found");
		
		}
	}
	
	
	
	
	
}
