package ch8;
import java.util.Scanner;

public class Chapter_08_E08_AllClosestPairOfPoints {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of points: ");
		int numberOfPoints = input.nextInt();
		
		double[][] points = new double[numberOfPoints][2];
		
		System.out.println("Enter " + numberOfPoints + " points: ");
		for (int i = 0; i < points.length; i++) {
			for (int j = 0; j < points[i].length; j++) {
				points[i][j] = input.nextDouble();
			}
		}
		
		int p1 = 0, p2 = 1;
		double shortestDistance = distance(points[p1][0], points[p1][1], points[p2][0], points[p2][1]);


		for (int i = 0; i < points.length; i++) {
			for (int j = i + 1; j < points.length; j++) {
				double distance = distance(points[i][0], points[i][1], points[j][0], points[j][1]);

				if (distance < shortestDistance){
					
					shortestDistance = distance;
				}
			}
		}
		
		for (int i = 0; i < points.length; i++) {
			for (int j = i + 1; j < points.length; j++) {
				double distance = distance(points[i][0], points[i][1], points[j][0], points[j][1]);

				if (distance == shortestDistance){
					
					System.out.println("The closest two points are " + 
							   "(" + points[i][0] + ", " + points[i][1] + ") and " + "(" + points[j][0] + ", " + points[j][1] + ")");
				}
			}
		}
		
	}
	
	public static double distance(double x1, double y1, double x2, double y2) {
		
		return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		
	}

}
