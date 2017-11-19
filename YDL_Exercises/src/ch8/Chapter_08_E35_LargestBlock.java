package ch8;
import java.util.Scanner;

public class Chapter_08_E35_LargestBlock {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Enter the number of rows in the matrix: ");
		int n = input.nextInt();
		
		int[][] m = new int[n][n];
		
		System.out.println("Enter the matrix row by row: ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				m[i][j] = input.nextInt();
			}
		}
						
		
		int[] largestBlock = findLargestBlock(m);
		
		System.out.println("The maximum square submatrix is at (" + largestBlock[0] + ", " 
							+ largestBlock[1] + ") with the size " + largestBlock[2]);
							
	}
	
	public static int[] findLargestBlock(int[][] m) {
		
		int[] largestBlock = new int[3];
				
		int[][] temp = new int[m.length][m.length];
		
		for (int i = 0; i < m.length; i++)
			temp[0][i] = m[0][i];
		
		for (int i = 0; i < m.length; i++)
			temp[i][0] = m[i][0];
		
		for (int i = 1; i < m.length; i++) {
			for (int j = 1; j < m.length; j++) {
				
				int minEntry = Math.min(temp[i][j - 1], temp[i - 1][j]);
				minEntry = Math.min(minEntry, temp[i - 1][j - 1]);
				
				if (m[i][j] == 1)
					temp[i][j] = minEntry + 1;
				else
					temp[i][j] = 0;
			}
		}
		
		int maxSize = 0;
		int row = -1;
		int col = -1;
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {
				if (maxSize < temp[i][j]) {
					maxSize = temp[i][j];
					row = i;
					col = j;
				}
			}
		}
		
		largestBlock[0] = row - maxSize + 1;
		largestBlock[1] = col - maxSize + 1;
		largestBlock[2] = maxSize;
		
		return largestBlock;
					
	}

}
