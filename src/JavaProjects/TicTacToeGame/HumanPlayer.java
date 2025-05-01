package JavaProjects.TicTacToeGame;

import java.util.Scanner;

public class HumanPlayer extends Player{

	public HumanPlayer(String name, char mark) {
		this.name = name;
		this.mark = mark;
	}

	public void makeMove() {

		int row;
		int col;

		do {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter row and column");
			row = scan.nextInt();
			col = scan.nextInt();
		} while (!isValidMove(row, col));

		TicTacToe.placeMark(row, col, mark);
	}


}
