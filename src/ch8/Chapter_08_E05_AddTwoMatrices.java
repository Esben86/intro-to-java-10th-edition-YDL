package ch8;
import java.util.Scanner;

public class Chapter_08_E05_AddTwoMatrices {

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
		
		double[][] sum = addMatrix(a,b);
		
		System.out.println("The matrices are added with the following result: ");
		System.out.println("Enter matrix 1: ");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(sum[i][j] + " ");
			}
			System.out.println();
		}
		

	}
	
	public static double[][] addMatrix(double[][] a, double[][] b) {
		
		double[][] sum = new double[2][2];
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				sum[i][j] = a[i][j] + b[i][j];
			}
		}
		return sum;
	}

}
