package JavaProjects;

import java.util.Scanner;

public class BankingProgram {
	
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		//Banking Java Program;
		
		double balance =0;
		boolean isRunning = true;
		int choice;
		
		
		while(isRunning) {
			
			System.out.println("*****************");
			System.out.println("BANKING PROGRAM");
			System.out.println("******************");
			System.out.println("Show Balance : 1 ");
			System.out.println("Deposit : 2");
			System.out.println("Withdraw : 3 ");
			System.out.println("Exit : 4");
			System.out.println("*******************");
			
			System.out.println("enter number (1-4):");
			choice = scanner.nextInt();
			
			switch(choice) {
			case 1 -> showBalance(balance);
			case 2 -> balance += deposit(balance);
			case 3 -> balance -= withdraw(balance);
			case 4 -> isRunning = false;
			default -> System.out.println("invalid enter");
			
			}
			
		}
		System.out.println("********************");
		System.out.println("THANK YOU! HAVE A NICE DAY!");
		System.out.println("*********************");
	}
	
	
	
	
	public static void showBalance(double balance) {
		System.out.printf("$%.2f\n", balance);	
	}

	public static double deposit(double balance) {
		double amount;
		
		System.out.println("Enter amount to be deposited : ");
		amount = scanner.nextDouble();
		
		if(amount <0) {
			System.out.println("Negative value is not allowed");
			return 0;
		}
		else {
			return amount;
		}
	}
	
	public static double withdraw(double balance) {
		double amount;
		
		System.out.println("Enter amount to be withdrawn : ");
		amount = scanner.nextDouble();
		
		if(amount > balance) {
			System.out.println("Amount withdrawn can not be greater than balance");
			return 0;
		}
		else if(amount < 0) {
			System.out.println("Negative value is not allowed");
			return 0;
		}
		else {
			return amount;
		}
	}
}
