package ch8;
import java.util.Scanner;

public class Chapter_08_E20_ConnectFour {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		char[][] grid = createGrid(6, 7);
		int turn = 0;
		char player = 'R';
		String playerColor = "";
		
				
		while (!hasWon(grid, player)) {
			
			if (turn == 42) {
				System.out.println("No player won, resetting grid..");
				createGrid(6, 7);
			}
			
			player = (turn % 2 == 0) ? 'R' : 'Y';
			playerColor = (turn % 2 == 0) ? "red" : "yellow";
			
			printGrid(grid);
			
			System.out.println("Drop a " + playerColor + " disc at column (0-6)");
			int column = input.nextInt();
						
			drop(grid, player, column);
			turn++;
		}
		printGrid(grid);
		System.out.println(playerColor + " wins!");
			
	}
	
	public static char[][] createGrid(int rows, int columns) {
		
		char[][] grid = new char[rows][columns];
		
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				grid[i][j] = ' ';
			}
		}
		return grid;
	}
	
	public static void printGrid(char[][] grid) {
		
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				System.out.print((j == 0) ? "|" + grid[i][j] + "|" : grid[i][j] + "|");
			}
			System.out.println();
		}
		System.out.println("---------------");
	}
	
	public static boolean checkRow(char[][] grid, char player) {
		
		char playerCheck = player;
		
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length - 3; j++) {
				if (grid[i][j] == playerCheck && grid[i][j + 1] == playerCheck 
					&& grid[i][j + 2] == playerCheck && grid[i][j + 3] == playerCheck) {
					System.out.println("4 '" + playerCheck + "'s on a row");
					return true;
				}	
			}
		}
		return false;
	}
	
	public static boolean checkColumn(char[][] grid, char player) {
		
		char playerCheck = player;
		
		for (int i = 0; i < grid.length + 1; i++) {
			for (int j = 0; j < grid.length - 3; j++) {
				if (grid[j][i] == playerCheck && grid[j + 1][i] == playerCheck
					&& grid[j + 2][i] == playerCheck && grid[j + 3][i] == playerCheck) {
					System.out.println("4 '" + playerCheck + "'s on a column");
					return true;
				}
			}
		}
		return false;
	}
	
	public static boolean checkTopLeftToBottomRight(char[][] grid, char player) {
		
		char playerCheck = player;
		
		for (int i = 0; i < grid.length - 3; i++) {
			for (int j = 0; j < grid[i].length - 3; j++) {
				if (grid[i][j] == playerCheck && grid[i + 1][j + 1] == playerCheck
					&& grid[i + 2][j + 2] == playerCheck && grid[i + 3][j + 3] == playerCheck) {
					System.out.println("4 '" + playerCheck + "'s on a down right diagonal");
					return true;
				}
			}
		}
		return false;
	}
	
	public static boolean checkBottomLeftToTopRight(char[][] grid, char player) {
		
		char playerCheck = player;
		
		for (int i = 3; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length - 3; j++) {
				if (grid[i][j] == playerCheck && grid[i - 1][j + 1] == playerCheck
					&& grid[i - 2][j + 2] == playerCheck && grid[i - 3][j + 3] == playerCheck) {
					System.out.println("4 '" + playerCheck + "'s on a up right diagonal");
					return true;
				}
			}
		}
		return false;
	}
	
	public static boolean hasWon(char[][] grid, char player) {
		return checkRow(grid, player) || checkColumn(grid, player) || 
			   checkTopLeftToBottomRight(grid, player) || checkBottomLeftToTopRight(grid, player);	
	}
	
	public static void drop(char[][] grid, char player, int column) {
		
		for (int i = grid.length - 1; i >= 0; i--) {
			if (grid[i][column] == ' ') {
				grid[i][column] = player;
				break;
			}
		}
	}
	
}
