package JavaProjects;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorGame {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		while(true) {
		String s[] = {"r", "p", "s"};
		String computerMove = s[new Random().nextInt(s.length)];
		String yourMove ;
		
		while(true) {
		
		System.out.println("Enter Your Move ");
		
		yourMove = scan.nextLine();
		
		if(yourMove.equals("r") || yourMove.equals("s") || yourMove.equals("p")) {
			break;
		}
			System.out.println("enter valid input");
		}
		
		
		System.out.println("Computer Move ::" + computerMove );
		
		if(computerMove.equals(yourMove)) {
			System.out.println("Game is draw!!!!");
		}
		else if(yourMove.equals("r")) {
			if(computerMove.equals("p")) {
				System.out.println("you lose");
			}
			else if(computerMove.equals("s")) {
				System.out.println("you win!!!");
			}
		}
		
		else if(yourMove.equals("p")) {
			if(computerMove.equals("s")) {
				System.out.println("you lose");
			}
			else if(computerMove.equals("r")) {
				System.out.println("you win!!!");
			}
		}
		
		else if(yourMove.equals("s")) {
			if(computerMove.equals("r")) {
				System.out.println("you lose");
			}
			else if(computerMove.equals("p")) {
				System.out.println("you win!!!");
			}
		}
		
		System.out.println(("Play Again !! (Y/N)"));
		
		String YesOrNo = scan.nextLine();
		
		if(!YesOrNo.equals("y")) {
			break;
		}
		
		}
		
	}

}
