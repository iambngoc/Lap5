package Lap5;

public class TicTacToe {
	private static final char EMPTY = ' ';
	private char[][] board;
	public TicTacToe(char[][] board) {
		this.board = board;
	}
	//Task 2.1
	public boolean checkRows() {
		for (int i = 0; i < board.length; i++) {
			if (board[i][0]!=' ') {
			for (int j = 1; j < board.length; j++) {
				char check = board[i][0]; //check = X or O
				//check xem cac phan tu cua 1 hang co cung 1 kieu khong
				if(board[i][j] != check) 
					break; // neu khac nhau thi check dong tiep theo
				if(j ==  board.length - 1)
					return true; // check den phan tu cuoi cua dong => all phan tu cung kieu
				}
			}
		}
		return false;
	}
	//Task 2.2
	public boolean checkColumns() {
		for (int i = 0; i < board.length; i++) {
			if (board[0][i]!=' ') {
			for (int j = 1; j < board.length; j++) {
				char check = board[0][i];
				// tuong tu nhu tren nhung la check phan tu cua 1 cot
				if(board[j][i] != check)  
					break;
				if(j ==  board.length - 1)
					return true;
				}
			}
		}
		return false;
	}
	//Task 2.3
	public boolean checkDiagonals() {
		//check duong cheo chinh
		if (board[0][0]!=' ') {
		for (int i = 1; i < board.length; i++) {
				char check = board[0][0];
				if(board[i][i] != check)
					break;
				if(i ==  board.length - 1)
					return true;
				}
			}
		//check duong cheo phu
		if (board[0][board.length-1]!=' ') {
		for (int i = 1, j = board.length - 2; i < board.length; i++, j--) {
			char check = board[0][board.length-1];
			if(board[i][j] != check)
				return false;
			if(i ==  board.length - 1)
				return true;
			}
		}
		return false;
	}
	//Task 2.4
	//3 methods tren ap dung duoc voi n x n matrix
	
	public static void main(String[] args) {
		char a[][] = {{ 'X', 'X', 'X'},
				 	  { ' ', 'O', ' '},
				 	  { 'O', 'O', 'X'}};
		
		char b[][] = {{ 'O', 'X', 'X'},
					  { ' ', 'O', 'X'},
					  { 'O', ' ', 'X'}};
		
		char c[][] = {{ 'X', 'X', 'O'},
					  { 'X', 'O', ' '},
					  { 'O', ' ', 'X'}};
		
		char d[][] = {{ ' ', 'X', 'X', 'O'},
					  { 'X', 'O', 'O', ' '},
					  { 'X', 'O', ' ', ' '},
					  { 'O', 'O', 'X', ' '}};
		
		TicTacToe aboard1 = new TicTacToe(a);
		TicTacToe aboard2 = new TicTacToe(b);
		TicTacToe aboard3 = new TicTacToe(c);
		TicTacToe aboard4 = new TicTacToe(d);
		System.out.println(aboard1.checkRows());
		System.out.println(aboard2.checkColumns());
		System.out.println(aboard3.checkDiagonals());
		System.out.println(aboard4.checkDiagonals());
	}
}
