package ch8;
import java.util.Scanner;

public class Chapter_08_E15_SameLine {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double[][] points = new double[5][2];
		
		System.out.println("Enter 5 points");
		
		for (int i = 0; i < points.length; i++) {
			for (int j = 0; j < points[i].length; j++) {
				points[i][j] = input.nextDouble();
			}
		}
		
		System.out.println(allPointsOnTheSameLine(points) ? "The points are on the same line" : "The points are not on the same line");

	}
	
	public static boolean allPointsOnTheSameLine(double[][] points) {
		
		for (int i = 0; i < points.length - 3; i++) {
			if (!onTheSameLine(points[i][0], points[i][1], points[i + 1][0], points[i + 1][1],
							   points[i + 2][0], points[i + 2][1])) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean onTheSameLine(double x0, double y0, double x1, double y1, double x2, double y2) {
		return ((x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0)) == 0;
	}

}
