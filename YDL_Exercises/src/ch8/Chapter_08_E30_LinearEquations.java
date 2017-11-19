package ch8;
import java.util.Scanner;

public class Chapter_08_E30_LinearEquations {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double[][] a = new double[2][2];
		double[] b = new double[2];
		
		System.out.println("Enter x1, y1, x2, y2: ");
		for (int i = 0; i < a.length; i++) 
			for (int j = 0; j < a.length; j++) 
				a[i][j] = input.nextDouble();
			
		
		System.out.println("Enter b1 and b2: ");
		for (int i = 0; i < b.length; i++)
			b[i] = input.nextDouble();
		
		double[] xy = linearEquation(a, b);
		
		if (xy != null) 
			System.out.println("X = " + xy[0] + " | Y = " + xy[1]);

	}
	
	public static double[] linearEquation(double[][] a, double[] b) {
		
		double[] xy = new double[2];
		
		if ((a[0][0] * a[1][1]) - (a[0][1] * a[1][0]) == 0) {
			System.out.println("The equation has no solution");
			return null;
		}
		
		xy[0] = ((b[0] * a[1][1]) - (b[1] * a[0][1])) / ((a[0][0] * a[1][1]) - (a[0][1] * a[1][0]));
		xy[1] = ((b[1] * a[0][0]) - (b[0] * a[1][0])) / ((a[0][0] * a[1][1]) - (a[0][1] * a[1][0]));
		
		return xy;
		
	}

}
