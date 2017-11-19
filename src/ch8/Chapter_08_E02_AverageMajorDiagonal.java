package ch8;
import java.util.Scanner;

public class Chapter_08_E02_AverageMajorDiagonal {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double[][] numbers = new double[4][4];
		
		System.out.println("Enter a 4-by-4 matrix row by row: ");
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				numbers[i][j] = input.nextDouble();
			}
		}
				
		System.out.println("The average of the major diagonal is " + averageMajorDiagonal(numbers));

	}
	
	public static double averageMajorDiagonal(double[][] m) {
		
		double sum = 0.0;
		
		for (int i = 0; i < m.length; i++) {
		
			sum += m[i][i];

		}
		return sum / m.length;
	}

}
