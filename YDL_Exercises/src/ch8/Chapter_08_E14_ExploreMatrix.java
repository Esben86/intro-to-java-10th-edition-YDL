package ch8;
import java.util.Scanner;

public class Chapter_08_E14_ExploreMatrix {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the size of the matrix: ");
		int size = input.nextInt();
		
		int[][] matrix = new int[size][size];
		boolean numbersOnRow = false, numbersOnCol = false;
		
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				matrix[i][j] = (int) (Math.random() * 2);
			}
		}
		
		printGrid(matrix);
		
		for (int i = 0; i < matrix.length; i++) {
			if(checkRow(matrix, i)) {
				System.out.println("All " + matrix[i][0] + "'s at row " + i);
				numbersOnRow = true;
			}
		}
		if (!numbersOnRow)
			System.out.println("No same numbers on a row");
			
		for (int i = 0; i < matrix.length; i++) {
			if(checkCol(matrix, i)) {
				System.out.println("All " + matrix[0][i] + "'s at col " + i);
				numbersOnCol = true;
			}
		}
		if (!numbersOnCol)
			System.out.println("No same numbers on a column");
		
		
		if (checkMajorDiagonal(matrix))
			System.out.println("All " + matrix[0][0] + "'s on the major diagonal ");
		else
			System.out.println("No same numbers on the major diagonal");
		
		if (checkSubDiagonal(matrix))
			System.out.println("All " + matrix[1][0] + "'s on the sub diagonal ");
		else
			System.out.println("No same numbers on the sub diagonal");
		
		if (checkSuperDiagonal(matrix))
			System.out.println("All " + matrix[0][1] + "'s on the super diagonal ");
		else
			System.out.println("No same numbers on the super diagonal");

	}
	
	public static void printGrid(int[][] matrix) {
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	
	public static boolean checkRow(int[][] matrix, int row) {
						
		for (int i = 0; i < matrix.length - 1; i++) {
			if (matrix[row][i] != matrix[row][i + 1]) {
				return false;
			}	
		}
		return true;
	}
	
	public static boolean checkCol(int[][] matrix, int col) {
		
		for (int i = 0; i < matrix.length - 1; i++) {
			if (matrix[i][col] != matrix[i + 1][col]) {
				return false;
			}	
		}
		return true;
	}
	
	public static boolean checkMajorDiagonal(int[][] matrix) {
		
		for (int i = 0; i < matrix.length - 1; i++) {
			if (matrix[i][i] != matrix[i + 1][i + 1]) {
				return false;				
			}	
			if (matrix[i][matrix.length - 1 - i] != matrix[i + 1][matrix.length - 1 - 1 - i]) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean checkSubDiagonal(int[][] matrix) {
		
		for (int i = 1; i < matrix.length - 1; i++) {
			if (matrix[i][i - 1] != matrix[i + 1][i]) {
				return false;				
			}
		}
		return true;
	}
	
	public static boolean checkSuperDiagonal(int[][] matrix) {
		
		for (int i = 0; i < matrix.length - 2; i++) {
			if (matrix[i][i + 1] != matrix[i + 1][i + 2]) {
				return false;				
			}
		}
		return true;
	}
	
}
