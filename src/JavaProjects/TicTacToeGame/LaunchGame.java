package JavaProjects.TicTacToeGame;

public class LaunchGame {

	public static void main(String[] args) {
		
		TicTacToe t = new TicTacToe();
	/*	
		t.dispBoard();
		t.placeMark(0, 0, 'X');
		t.dispBoard();
		t.placeMark(1, 1, 'X');
		t.dispBoard();
		t.placeMark(2, 2, 'X');
		t.dispBoard();
		
		t.placeMark(0, 2, 'O');
		t.dispBoard();
		t.placeMark(1, 1, 'O');
		t.dispBoard();
		t.placeMark(2, 0, 'O');
		t.dispBoard();
		System.out.println(t.checkRowWin());
		System.out.println(t.checkColWin());
		System.out.println(t.checkDiagWin());
	*/
		
/*		t.dispBoard();
		System.out.println(t.checkRowWin());
		System.out.println(t.checkColWin());
		System.out.println(t.checkDiagWin());
*/
		
		
		HumanPlayer p1 = new HumanPlayer("Meena", 'X');
		AIPlayer p2 = new AIPlayer("Kanda", 'O');
		
		Player cp;
		cp = p1;
		
		while(true) {
		System.out.println(cp.name + " turn ");
		cp.makeMove();
		TicTacToe.dispBoard();
		
		if(TicTacToe.checkRowWin() || TicTacToe.checkColWin() || TicTacToe.checkDiagWin()) {
			System.out.println(cp.name + " has Won");	
			break;
		}
		else if(TicTacToe.checkDraw()){
			System.out.println("GAME IS A DRAW !!!!!! ");
			break;
		}
		
		else {
			if(cp == p1) {
				cp = p2;
			}
			else {
				cp = p1;
			}
		}
		
		} 
		
		
	}

}
