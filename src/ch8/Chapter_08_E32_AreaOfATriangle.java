package ch8;

import java.util.Scanner;

public class Chapter_08_E32_AreaOfATriangle {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double[][] points = new double[3][2];
		
		System.out.println("Enter three points of a triangle (x1, y1), (x2, y2), (x3, y3): ");
		for (int i = 0; i < points.length; i++) {
			for (int j = 0; j < points[i].length; j++) {
				points[i][j] = input.nextDouble();
			}
		}
		
		System.out.println("The area of the triangle is " + getTriangleArea(points));

	}
	
	public static double getTriangleArea(double[][] points) {
		
		if ((points[1][0] - points[0][0]) * (points[2][1] - points[0][1]) -
			(points[2][0] - points[0][0]) * (points[1][1] - points[0][1]) == 0) {
			return 0;
		}
			
		
		double s1 = distance(points[0][0], points[0][1], points[1][0], points[1][1]);
		double s2 = distance(points[1][0], points[1][1], points[2][0], points[2][1]);
		double s3 = distance(points[2][0], points[2][1], points[0][0], points[0][1]);
		
		double s = (s1 + s2 + s3) / 2;
		
		double area = Math.sqrt(s * (s - s1) * (s - s2) * (s - s3));
		
		return area;
		
	}
	
	public static double distance(double x1, double y1, double x2, double y2) {
		
		return Math.sqrt(((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)));
		
	}

}
