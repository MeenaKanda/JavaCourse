package JavaProjects.TicTacToeGame;

import java.util.Random;
import java.util.Scanner;

public class AIPlayer extends Player{

	public AIPlayer(String name, char mark) {
		this.name = name;
		this.mark = mark;
	}

	public void makeMove() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter row and column");
		int row;
		int col;
		do {
			Random r = new Random();
			row = r.nextInt(3);
			col = r.nextInt(3);	
		}while(!isValidMove(row, col));
		TicTacToe.placeMark(row, col, mark);

	}

}
