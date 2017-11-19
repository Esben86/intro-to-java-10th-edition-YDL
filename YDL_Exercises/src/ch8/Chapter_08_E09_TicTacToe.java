package ch8;
import java.util.Scanner;

public class Chapter_08_E09_TicTacToe {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String[][] board = {{" ", " ", " "},
							{" ", " ", " "},
							{" ", " ", " "}};
		String player = "";
		int row, col;
		int turn = 0;
				
		while (!checkBoard(board, player)) {
			printBoard(board);
			player = (turn % 2 == 0) ? "X" : "O";
			
			do {
				do {
					System.out.println("Enter a row (0, 1 or 2) and column (0, 1 or 2) for player " + player + ":" );
					row = input.nextInt();
					col = input.nextInt();
				} while (row < 0 && row > 2 && col < 0 && col > 2);								
			} while (board[row][col] != " ");
			
			board[row][col] = player;
			turn++;	
		}
		printBoard(board);
		System.out.println(player + " has won");
	}
	
	public static void printBoard(String[][] board) {
		System.out.println("-------------");
		System.out.println("| " + board[0][0] + " | " + board[0][1] + " | " + board[0][2] + " |" );
		System.out.println("-------------");
		System.out.println("| " + board[1][0] + " | " + board[1][1] + " | " + board[1][2] + " |" );
		System.out.println("-------------");
		System.out.println("| " + board[2][0] + " | " + board[2][1] + " | " + board[2][2] + " |" );
		System.out.println("-------------");
	}
	
	public static boolean checkBoard(String[][] board, String player) {
		return checkRow(board, player) || checkColumn(board, player) || checkDiagonal(board, player);
	}
	
	public static boolean checkRow(String[][] board, String player) {
		
		for (int i = 0; i < board.length; i++) 
			if (board[i][0] == player &&  board[i][1] == player && board[i][2] == player)
				return true;
		
		return false;
	}
	
	public static boolean checkColumn(String[][] board, String player) {
		
		for (int i = 0; i < board.length; i++) 
			if (board[0][i] == player &&  board[1][i] == player && board[2][i] == player)
				return true;
		
		return false;	
	}
	
	public static boolean checkDiagonal(String[][] board, String player) {
		 
			if (board[0][0] == player && board[1][1] == player && board[2][2] == player)
				return true;
		
			if (board[0][2] == player &&  board[1][1] == player && board[2][0] == player)
					return true;
		
		return false;
	}
}
