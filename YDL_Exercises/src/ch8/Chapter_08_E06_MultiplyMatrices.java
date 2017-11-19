package ch8;
import java.util.Scanner;

public class Chapter_08_E06_MultiplyMatrices {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double[][] a = new double[2][2];
		double[][] b = new double[2][2];
		
		
		System.out.println("Enter matrix 1: ");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = input.nextDouble();
			}
		}
		
		System.out.println("Enter matrix 2: ");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				b[i][j] = input.nextDouble();
			}
		}
		
		double[][] c = multiplyMatrix(a, b);
		
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c.length; j++) {
				System.out.print(c[i][j] + " ");	
			}
			System.out.println();
		}

	}
	
	public static double[][] multiplyMatrix(double[][] a, double[][] b) {
		
		double[][] c = new double[2][2];
		
		int aRows = a.length;
		int aColumn = a[0].length;
		int bColumn = b[0].length;
		
		for (int i = 0; i < aRows; i++) {
			for (int j = 0; j < bColumn; j++) {
				for (int k = 0; k < aColumn; k++) {
					c[i][j] += a[i][k] * b[k][j];
				}
			}
		}
		return c;
	}

}
