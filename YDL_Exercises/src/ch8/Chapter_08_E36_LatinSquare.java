package ch8;
import java.util.Scanner;

public class Chapter_08_E36_LatinSquare {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number n: ");
		int n = input.nextInt();
		
		System.out.println("Enter " + n + " rows of letters separated by spaces: ");
		char[][] m = new char[n][n];
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				m[i][j] = input.next().charAt(0);
				
				if (!inputVerifier(m[i][j], m.length)) {
					System.out.println("Invalid input " + m[i][j] + ": the letters must be from A to " + (char) ('A' + (n - 1)));
				}
			}
		}
		System.out.println("The matrix is " + (checkMatrix(m) ? "a latin square" : "not a latin square"));			
	}
	
	public static boolean checkMatrix(char[][] m) {
		
		for (int i = 0; i < m.length; i++) {
			
			if (!checkRow(m, i) && !checkColumn(m, i))
				return false;
		}
		return true;
	}
	
	public static boolean checkRow(char[][] m, int row) {
		
		boolean[] found = new boolean[m.length];
		for (int i = 0; i < m.length; i++) {
			int index = m[row][i] - 'A';
			
			if (!found[index])
				found[index] = true;
			else 
				return false;	
		}
		return true;
	}
	
	public static boolean checkColumn(char[][] m, int column) {
		
		boolean[] found = new boolean[m.length];
		for (int i = 0; i < m.length; i++) {
			int index = m[i][column] - 'A';
			
			if (!found[index])
				found[index] = true;
			else 
				return false;	
		}
		return true;
	}
	
	public static boolean inputVerifier(char ch, int range) {		
		if (ch >= 'A' && ch <= 'A' + (range - 1))
			return true;
		else
			return false;
	}

}
