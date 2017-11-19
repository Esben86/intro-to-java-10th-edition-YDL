package ch11;
import java.util.Arrays;
import java.util.ArrayList;

public class Chapter_11_E09_SmallestRowsAndColumns {

	public static void main(String[] args) {
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		System.out.println("Enter the size of the array: ");
		int size = input.nextInt();
		
		int[][] matrix = createArray(size);
		
		System.out.println("The random array is: ");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}
		
		ArrayList<Integer> zeroRow = maxRow(matrix);
		ArrayList<Integer> zeroCol = maxCol(matrix);
		
		System.out.println("The most 0s row index " + zeroRow);
		System.out.println("The most 0s col index " + zeroCol);
		
	}
	
	public static int[][] createArray(int size) {
		
		int[][] matrix = new int[size][size];
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				matrix[i][j] = (int)(Math.random() * 2);
			}
		}
		return matrix;
	}
	
	public static ArrayList<Integer> maxRow(int[][] matrix) {
		
		ArrayList<Integer> maxRowIndex = new ArrayList<>();
		
		int maxCount = 0;
		
		for (int i = 0; i < matrix.length; i++) {
			int zeroCount = 0;
			for (int j = 0; j < matrix.length; j++) {
				
				if (matrix[i][j] == 0) 
					zeroCount++;
				
				if (zeroCount > maxCount) {
					maxCount = zeroCount;
					maxRowIndex.clear();
					maxRowIndex.add(i);
				}	
			}
		}
		return maxRowIndex;
	}
	
	public static ArrayList<Integer> maxCol(int[][] matrix) {
		
		ArrayList<Integer> maxColIndex = new ArrayList<>();
		
		int maxCount = 0;
		
		for (int i = 0; i < matrix.length; i++) {
			int zeroCount = 0;
			for (int j = 0; j < matrix.length; j++) {
				
				if (matrix[j][i] == 0) 
					zeroCount++;
				
				if (zeroCount > maxCount) {
					maxCount = zeroCount;
					maxColIndex.clear();
					maxColIndex.add(i);
				}	
			}
		}
		return maxColIndex;
	}
	
	
		
}
