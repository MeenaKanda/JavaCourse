package JavaProjects;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

	public static void main(String[] args) {
		
		Random r = new Random();
		int randomNumer = r.nextInt(100) +1;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Random Number is " + randomNumer);
		
		while(true) {
			
			System.out.println("Enter your guess Number (1-100) :");
			int guessingNumber = scan.nextInt();
			
			if(guessingNumber == randomNumer) {
				System.out.println("Correct!!! You won");
				break;
			}
			else if(guessingNumber > randomNumer) {
				System.out.println("Nope !! The number is higher.Guess the number again");
			}
			else {
				System.out.println("Nope !! The number is lower.Guess the number again");
			}
		}
		
		
	}

}
