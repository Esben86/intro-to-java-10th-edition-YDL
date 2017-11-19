package ch10;
import java.util.Scanner;

public class Chapter_10_E15_BoundingRectangle {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double[][] points = new double[5][2];
		
		
		System.out.println("Enter five points: ");
		for (int i = 0; i < points.length; i++) {
			for (int j = 0; j < points[i].length; j++) {
				points[i][j] = input.nextDouble();
			}
		}
		
		MyRectangle2D r = MyRectangle2D.getRectangle(points);
		
		System.out.println("The bounding rectangle's center (" + r.getX() + ", " + r.getY() + "), width " +
							r.getWidth() + ", height " + r.getHeight());

	}

}
