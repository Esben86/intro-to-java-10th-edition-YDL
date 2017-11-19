package ch9;
import java.util.Scanner;

public class Chapter_09_E13_TestLocation {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of rows and columns in the matrix: ");
		int rows = input.nextInt();
		int columns = input.nextInt();
		double[][] m = new double[rows][columns];
		
		System.out.println("Enter the values row by row: ");
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = input.nextDouble();
			}
		}
		
		Location location = Location.locateSmallest(m);
		
		System.out.println("The smallest element is " + location.minValue + " and is located at ("
				            + location.row + ", " + location.column + ")");
		

	}

}
