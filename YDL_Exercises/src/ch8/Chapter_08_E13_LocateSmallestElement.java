package ch8;
import java.util.Scanner;

public class Chapter_08_E13_LocateSmallestElement {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of rows and columns in the array: ");
		int rows = input.nextInt();
		int cols = input.nextInt();
		
		double[][] matrix = new double[rows][cols];
		
		System.out.println("Enter the array: ");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < rows; j++) {
				matrix[i][j] = input.nextDouble();
			}
		}
		
		int[] smallestCoordinates = locateSmallest(matrix);
		
		System.out.println("The location of the smallest element is at (" + smallestCoordinates[0] + 
							", " + smallestCoordinates[1] + ")");

	}
	
	public static int[] locateSmallest(double[][] matrix) {
		
		int[] smallestCoordinates = new int[2];
		double smallestValue = matrix[0][0];
		
		for (int i = 0; i < matrix.length; i++)
			for(int j = 0; j < matrix[i].length; j++) {
				
				if (matrix[i][j] < smallestValue) {
					smallestValue = matrix[i][j];
					smallestCoordinates[0] = i;
					smallestCoordinates[1] = j;
				}
			}
		return smallestCoordinates;
	}
}
