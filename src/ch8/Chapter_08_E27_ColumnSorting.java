package ch8;
import java.util.Scanner;

public class Chapter_08_E27_ColumnSorting {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double[][] m = new double[4][4];
		
		System.out.println("Enter a 4-by-4 matrix row by row: ");
		for (int i = 0; i < m.length; i++)
			for (int j = 0; j < m.length; j++)
				m[i][j] = input.nextDouble();
		
		for (int i = 0; i < m.length; i++)
			selectionSort(m, i);
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void selectionSort(double[][] m, int column) {
		
		for (int i = 0; i < m.length; i++) {
			
			int currentMinIndex = i;
			double currentMin = m[i][column];
			
			for (int j = i + 1; j < m.length; j++) {
				
				if (m[j][column] < currentMin) {
					currentMinIndex = j;
					currentMin = m[j][column];
				}	
			}
			if (currentMinIndex != i) {
				m[currentMinIndex][column] = m[i][column];
				m[i][column] = currentMin;
			}
		}	
	}

}
