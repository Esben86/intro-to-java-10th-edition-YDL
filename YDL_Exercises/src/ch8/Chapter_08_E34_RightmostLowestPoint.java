package ch8;
import java.util.Scanner;

public class Chapter_08_E34_RightmostLowestPoint {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double[][] points = new double[6][2];
		
		System.out.println("Enter 6 points:");
		for (int i = 0; i < points.length; i++) {
			for (int j = 0; j < points[i].length; j++) {
				points[i][j] = input.nextDouble();
			}
		}
		
		double[] rightmostLowestPoint = getRightmostLowestPoint(points);
		
		System.out.println("The rightmost lowest point is (" + rightmostLowestPoint[0] + ", " + rightmostLowestPoint[1] + ")" );
			

	}
	
	public static double[] getRightmostLowestPoint (double[][] points) {
		
		double[] rightmostLowestPoint = points[0];
		
		for (int i = 0; i < points.length; i++) {
			if (points[i][1] < rightmostLowestPoint[1])
				rightmostLowestPoint = points[i];
			else if (points[i][1] == rightmostLowestPoint[1] &&
					 points[i][0] > rightmostLowestPoint[0])
				rightmostLowestPoint = points[i];		
		}
		return new double[] {rightmostLowestPoint[0], rightmostLowestPoint[1]};
	}
}
