package ch8;
import java.util.Scanner;

public class Chapter_08_E26_RowSorting {

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
	
	public static void selectionSort(double[][] m, int row) {
		
		for (int i = 0; i < m.length; i++) {
			
			int currentMinIndex = i;
			double currentMin = m[row][i];
			
			for (int j = i + 1; j < m.length; j++) {
				
				if (m[row][j] < currentMin) {
					currentMinIndex = j;
					currentMin = m[row][j];
				}	
			}
			if (currentMinIndex != i) {
				m[row][currentMinIndex] = m[row][i];
				m[row][i] = currentMin;
			}
		}	
	}

}
