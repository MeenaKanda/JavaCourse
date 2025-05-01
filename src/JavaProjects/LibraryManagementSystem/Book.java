package JavaProjects.LibraryManagementSystem;

import java.util.Scanner;

public class Book {

	//Class data member
	public int sNo;
	public String bookName;
	public String authorName;
	public int bookQty;
	public int bookQtyCopy;
	
	
	//create scanner object
	Scanner input = new Scanner(System.in);
	
	
	public Book(){
		
		System.out.println("Enter Serial No of book :");
		this.sNo = input.nextInt();
		
		System.out.println("Enter Book Name :");
			
		input.nextLine();
		this.bookName = input.nextLine();
		
		System.out.println("Enter Author Name :");
		this.authorName = input.nextLine();
		
		System.out.println("Enter Quantity of book : ");
		this.bookQty = input.nextInt();
		this.bookQtyCopy = input.nextInt();
	
	}
	
	
}
