package ch8;
import java.util.Scanner;

public class Chapter_08_E24_CheckSudoku {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int[][] validSolution = {{9, 6, 3, 1, 7, 4, 2, 5, 8}, 
							  	 {1, 7, 8, 3, 2, 5, 6, 4, 9},
							  	 {2, 5, 4, 6, 8, 9, 7, 3, 1},
							  	 {8, 2, 1, 4, 3, 7, 5, 9, 6},
							  	 {4, 9, 6, 8, 5, 2, 3, 1, 7},
							  	 {7, 3, 5, 9, 6, 1, 8, 2, 4},
							  	 {5, 8, 9, 7, 1, 3, 4, 6, 2},
							  	 {3, 1, 7, 2, 4, 6, 9, 8, 5},
							  	 {6, 4, 2, 5, 9, 8, 1, 7 ,3}};
		
		System.out.println("Enter a Sudoku puzzle solution:");
        int[][] grid = new int[9][9];
        for (int i = 0; i < 9; i++)
            for (int j = 0; j < 9; j++)
                grid[i][j] = input.nextInt();
		
        System.out.println(validSolution(grid) ? "The solution is valid" : "The solutin is not valid");
		
	}
	
	public static int[][] readSolution() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a sudoku puzzle solution: ");
		int[][] grid = new int[9][9];
		
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				grid[i][j] = input.nextInt();
			}
		}
		return grid;
	}
	
	public static boolean checkRows(int[][] grid) {
						
		for (int i = 0; i < grid.length; i++) {
			boolean[] validRow = new boolean[9];
			for (int j = 0; j < grid[i].length; j++) {
				int index = grid[i][j] - 1;
				if (index > 8)
					return false;
				if (!validRow[index]) {
					validRow[index] = true;
				} else {
					return false;
				}	
			}	
		}
		return true;
	}
	
	public static boolean checkColumns(int[][] grid) {
		
		for (int i = 0; i < grid[0].length; i++) {
			boolean[] validColumn = new boolean[9];
			for (int j = 0; j < grid.length; j++) {
				int index = grid[j][i] - 1;
				if (index > 8)
					return false;
				if (!validColumn[index]) {
					validColumn[index] = true;
				} else {
					return false;
				}	
			}	
		}
		return true;
	}
			
	public static boolean checkBox(int[][] grid) {
		
		for (int g = 0; g < 9; g+= 3) {
			for (int h = 0; h < 9; h += 3) {
				
				boolean[] validBox = new boolean[9];
				
				for (int i = g; i < g + 3; i++) {
					for (int j = h; j < h + 3; j++) {
						int index = grid[i][j] - 1;
						if (index > 8)
							return false;
						if (!validBox[index]) {
							validBox[index] = true;
						} else {
							return false;
						}
					}
				}
			}
		}
		return true;
	}
	
	public static boolean validSolution(int[][] grid) {
		return checkRows(grid) && checkColumns(grid) && checkBox(grid);
	}
	
}
