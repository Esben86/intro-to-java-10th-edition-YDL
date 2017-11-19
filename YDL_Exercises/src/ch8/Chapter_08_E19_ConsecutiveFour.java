package ch8;
import java.util.Scanner;

public class Chapter_08_E19_ConsecutiveFour {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the matrix size: ");
		int size = input.nextInt();
		
		int[][] m = new int[size][size];
		
		for (int i = 0; i < m.length; i++){
			for (int j = 0; j < m.length; j++){
				m[i][j] = (int)(Math.random() * 9);
			}
		}
		
		for (int i = 0; i < m.length; i++){
			for (int j = 0; j < m.length; j++){
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println(checkRow(m) ? "The matrix has consectuive fours on a row" : "The matrix has no consectuive fours on a row" );
		System.out.println(checkColumn(m) ? "The matrix has consectuive fours on a column" : "The matrix has no consectuive fours on a column" );
		System.out.println(checkTopLeftToBottomRight(m) ? "The matrix has consectuive fours on a top left to bottom right diagonal" : "The matrix has no consectuive fours on a top left to bottom right diagonal");
		System.out.println(checkBottomLeftToTopRight(m) ? "The matrix has consectuive fours on a bottom left to top right diagonal" : "The matrix has no consectuive fours on a top left to bottom right diagonal");
	}
	
	public static boolean checkRow (int[][] m) {
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length - 3; j++) {
				if (m[i][j] == m[i][j + 1] && m[i][j + 1] == m[i][j + 2] && m[i][j + 2] == m[i][j + 3]) {
					return true;
				}	
			}
		}
		return false;
	}
	
	public static boolean checkColumn (int[][] m) {
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length - 3; j++) {
				if (m[j][i] == m[j + 1][i] && m[j + 1][i] == m[j + 2][i] && m[j + 2][i] == m[j + 3][i]) {
					return true;
				}
			}
		}
		return false;
	}
	
	public static boolean checkTopLeftToBottomRight(int[][] m) {
		
		for (int i = 0; i < m.length - 3; i++) {
			for (int j = 0; j < m[i].length - 3; j++) {
				if (m[i][j] == m[i + 1][j + 1] && m[i + 1][j + 1] == m[i + 2][j + 2] && m[i + 2][j + 2] == m[i + 3][j + 3]) {
					return true;
				}
			}
		}
		return false;
	}
	
	public static boolean checkBottomLeftToTopRight(int[][] m) {
		
		for (int i = 0; i < m.length - 3; i++) {
			for (int j = 0; j < m[i].length - 3; j++) {
				if (m[i + 3][j] == m[i + 2][j + 1] && m[i + 2][j + 1] == m[i + 1][j + 2] && m[i + 1][j + 2] == m[i][j + 3]) {
					return true;
				}
			}
		}
		return false;
	}

}
