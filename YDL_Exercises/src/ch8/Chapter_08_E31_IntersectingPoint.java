package ch8;

import java.util.Scanner;

public class Chapter_08_E31_IntersectingPoint {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double[][] points = new double[4][2];
		
		System.out.println("Enter 4 points (x1, y1), (x2, y2), (x3, y3), (x4, y4)");
		
		for (int i = 0; i < points.length; i++) {
			for (int j = 0; j < points[i].length; j++) {
				points[i][j] = input.nextDouble();
			}
		}
		
		double[] intersectingPoints = getIntersectingPoint(points);
		
		if (intersectingPoints[0] == 0 && intersectingPoints[1] == 0)
			System.out.println("The lines are paralell");
		else
			System.out.println("The intersecting point is (" + intersectingPoints[0] + " , " + intersectingPoints[1] + ")");

	}
	
	public static double[] getIntersectingPoint(double[][] points) {
		
		double[] intersectingPoints = new double[2];
						
		double a = points[0][1] - points[1][1];
		double b = -(points[0][0] - points[1][0]);
		double e = (points[0][1] - points[1][1]) * points[0][0] - (points[0][0] - points[1][0]) * points[0][1];
		
		double c = points[2][1] - points[3][1];
		double d = -(points[2][0] - points[3][0]);
		double f = (points[2][1] - points[3][1]) * points[2][0] - (points[2][0] - points[3][0]) * points[2][1];
		
		double denom = (a * d) - (b * c);
		
		intersectingPoints[0] = ((e * d) - (b * f)) / denom;
		intersectingPoints[1] = ((a * f) - (e * c)) / denom;
		
		if (denom != 0)
			return intersectingPoints;
		else
			return null;
		
	}

}
