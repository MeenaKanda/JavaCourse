package JavaProjects.LibraryManagementSystem;

import java.util.Scanner;

public class Books {

	// Java Program to Illustrate books class
	// To Do all the Operations related to Books such as
	// add, check-in, check-out,Valid books,Update books
	
	
	//Class data member
	Book theBook[]  = new Book[50];
	public static int count;
	
	Scanner input = new Scanner(System.in);
	
	//Method 1 
	//Compare books
	public int compareBookObjects(Book b1, Book b2) {
		if(b1.bookName.equalsIgnoreCase(b2.bookName)) {
			System.out.println("Name of this book is Already Exists");
			return 0;
		}
		else if(b1.sNo == b2.sNo) {
			System.out.println("Serial No of this book is Already Exist");
			return 0;
		}
		return 1;
	}
	
	
	//Method 2
	//To add book
	public  void addBook(Book b) {
		
		for(int i=0; i<count; i++) {
			if(this.compareBookObjects(b, this.theBook[i]) == 0) {
				return;
			}
		}
		
		if(count <50) {
			theBook[count] = b;
			count++;
		}
		else {
			System.out.println("No space for More book ");
		}
	}
	
 	 
	//Method 3
	// To search book by serial number
	
	public void searchBySno() {
		
		System.out.println("\t\t\t\tSearch the Book by Serial No\n");
		
		System.out.println("Enter Serial No of Book:");
		int serialNo = input.nextInt();
		int flag =0;
		
		System.out.println("S.No\t\tName\t\tAuthor\t\tAvailable Qty\t\tTotal Qty");
		
		for(int i=0; i<count; i++) {
			if(serialNo == theBook[i].sNo ) {
				System.out.println(
						theBook[i].sNo + "\t\t"
						+theBook[i].bookName + "\t\t"
						+theBook[i].authorName + "\t\t"
						+theBook[i].bookQty + "\t\t"
						+theBook[i].bookQtyCopy
						);
				flag ++;
				return;
				
			}
			if(flag==0) {
				System.out.println("No Book for Serial No " + serialNo + " found");
			}
		}
	}
	
	
	//Method 4
	//Search book by Author Name
	public void searchByAuthorName() {
		
		int flag =0;
		System.out.println("\t\t\tSearch By Author Name");
		
		input.nextLine();
		
		System.out.println("Enter Author Name : ");
		
		String AuthorName = input.nextLine();
		
		System.out.println("S.No\t\tName\t\tAuthor\t\tAvailable Qty\t\tTotal Qty");
	 
		
		for(int i=0; i<count; i++) {
			
			//if author matches any of its book
			if(AuthorName.equalsIgnoreCase(theBook[i].authorName)) {
				System.out.println(
						theBook[i].sNo + "\t\t"
						+theBook[i].bookName + "\t\t"
						+theBook[i].authorName + "\t\t"
						+theBook[i].bookQty + "\t\t"
						+theBook[i].bookQtyCopy
						);
				flag++;
				return;
			}
			//Else no book matches for author
			if(flag==0) {
				System.out.println("No books of " + AuthorName + " Found.");
			}
		}
	}
	
	//Method 5
	//To display all books
	public void showAllBooks() {
		
		System.out.println("\t\t\tSHOWING ALL BOOKS\n");
		System.out.println("S.No\t\tName\t\tAuthor\t\tAvailable Qty\t\tTotal Qty");
		
		for(int i=0; i<count; i++) {
			System.out.println(
					theBook[i].sNo + "\t\t"
					+theBook[i].bookName + "\t\t"
					+theBook[i].authorName + "\t\t"
					+theBook[i].bookQty + "\t\t"
					+theBook[i].bookQtyCopy
					);	
		}
	}
	
	public void upgradeBookQty() {
		System.out.println("\t\t\tUPGRADE QUANTITY OF THE BOOK\n");
		
		System.out.println("Enter Serial No of the book");
		
		int serialNo = input.nextInt();
		
		for(int i=0; i<count; i++) {
			if(serialNo == theBook[i].sNo) {
				System.out.println("Enter no of book to be added ");
				int addingBookQty = input.nextInt();
				
				theBook[i].bookQty += addingBookQty;
				theBook[i].bookQtyCopy += addingBookQty;
				return;
			}
			else {
				System.out.println("Serial No is not present So Can not upgrade Book Quantity");
			}
		}
		
	}
	
	
	//Method 7
	// To create menu
	public void displayMenu() {
		 System.out.println(
		            "----------------------------------------------------------------------------------------------------------");
		        System.out.println("Press 1 to Add new Book.");
		        System.out.println("Press 0 to Exit Application.");
		        System.out.println(
		            "Press 2 to Upgrade Quantity of a Book.");
		        System.out.println("Press 3 to Search a Book.");
		        System.out.println("Press 4 to Show All Books.");
		        System.out.println("Press 5 to Register Student.");
		        System.out.println(
		            "Press 6 to Show All Registered Students.");
		        System.out.println("Press 7 to Check Out Book. ");
		        System.out.println("Press 8 to Check In Book");
		        System.out.println(
		            "-------------------------------------------------------------------------------------------------------");
	}
	
	
	//Method 8
	//To search Availability of book in Library
	
	public int isAvailable(int sNo) {
		for(int i=0; i<count; i++) {
			if(sNo == theBook[i].sNo) {
				if(theBook[i].bookQty > 0) {
					System.out.println("Book is Available in Library");
					return i;
				}
					System.out.println("Book is Unavailable");
					return -1;
			}	
		}
	            	System.out.println("Serial No entered " + sNo + "Not Found");
		            return -1;	
	}
	
	
	//Method 9
	//To remove the book from the Library after Checkout
	
	public Book checkOutBook() {
		
		System.out.println("Enter serial No of the Book to be Checked Out");
	
		int serialNo = input.nextInt();
		
		int bookIndex = isAvailable(serialNo);
		
		if(bookIndex != -1) {
			theBook[bookIndex].bookQtyCopy--;
			return theBook[bookIndex];
		}
		return null;
	
		}
	
	
	//Method 10
	//To add the book to the library
	public void checkInBook(Book b) {
		for(int i=0; i<count; i++) {
			if(b.equals(theBook[i])) {
				theBook[i].bookQtyCopy++;
				return;
			}
		}
	}
	

}
