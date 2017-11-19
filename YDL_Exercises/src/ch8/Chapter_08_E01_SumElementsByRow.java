package ch8;
import java.util.Scanner;

public class Chapter_08_E01_SumElementsByRow {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double[][] numbers = new double[3][4];
		
		System.out.println("Enter a 3-by-4 matrix row by row: ");
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				numbers[i][j] = input.nextDouble();
			}
		}
		
		for (int rowIndex = 0; rowIndex < numbers.length; rowIndex++)
			System.out.println("Row " + rowIndex + " has the sum of " + sumRow(numbers, rowIndex));
			
	}
	
	public static double sumRow(double[][] m, int rowIndex) {
		
		double sum = 0;
		
		for (int i = 0; i < m.length; i++)
			sum += m[rowIndex][i];
		
		return sum;
	}

}
