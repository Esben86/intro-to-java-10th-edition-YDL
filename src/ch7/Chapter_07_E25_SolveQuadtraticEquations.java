package ch7;
import java.util.Scanner;

public class Chapter_07_E25_SolveQuadtraticEquations {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double[] eqn = new double[3];
		double[] roots = {-1, -1};
		
		System.out.println("Enter the coefficients a, b and c for ax^2 + bx + c");
		for (int i = 0; i < eqn.length; i++) 
			eqn[i] = input.nextDouble();
		
		if (solveQuadratic(eqn, roots) == 2) {
			System.out.println("The equation has two roots " + roots[0] + " and " + roots[1]);
		} else if (solveQuadratic(eqn, roots) == 1) {
			System.out.println("The equation has one root " + roots[0]);
		} else 
			System.out.println("The equation has no real roots");

	}
	
	public static int solveQuadratic(double[] eqn, double[] roots) {
		
		int numberOfRoots = 0;
		
		double a = eqn[0];
		double b = eqn[1];
		double c = eqn[2];
		
		double x1 = (- b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
		double x2 = (- b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
		
		if ((Math.pow(b, 2) - (4 * a * c)) > 0) {
			numberOfRoots = 2;
			roots[0] = x1;
			roots[1] = x2;
		} else if ((Math.pow(b, 2) - (4 * a * c)) == 0) {
				numberOfRoots = 1;
				roots[0] = x1;	
			} 
		return numberOfRoots;
	}

}
