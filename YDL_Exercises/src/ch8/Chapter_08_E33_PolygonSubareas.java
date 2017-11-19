package ch8;

import java.util.Scanner;

public class Chapter_08_E33_PolygonSubareas {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double[][] points = new double[4][2];
		double[] intersectingPoint = new double[2];
		
		System.out.println("Enter (x1,y1), (x2,y2), (x3,y3) and (x4,y4): ");
		
		for (int i = 0; i < points.length; i++) {
			for (int j = 0; j < points[i].length; j++) {
				points[i][j] = input.nextDouble();
			}
		}
		
		intersectingPoint = getIntersectingPoint(points);
		
		double[] area = new double[4];
        for (int i = 0; i < points.length; i++) {

            int j = ((i + 1) % points.length);
                        
            double[][] triangle = new double[][] {
                    points[i], points[j], intersectingPoint
            };
            double triangleArea = getTriangleArea(triangle);
            area[i] = triangleArea;
        }
        
        sort(area);
		
        for (int i = 0; i < area.length; i++)
        	System.out.printf("%2.2f ", area[i]);

	}
	
	public static double distance(double x1, double y1, double x2, double y2) {
		return Math.sqrt(((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)));
	}
	
	public static double[] getIntersectingPoint(double[][] points) {
		
		double[] intersectingPoints = new double[2];
						
		double a = points[0][1] - points[2][1];
		double b = -(points[0][0] - points[2][0]);
		double e = (points[0][1] - points[2][1]) * points[0][0] - (points[0][0] - points[2][0]) * points[0][1];
		
		double c = points[1][1] - points[3][1];
		double d = -(points[1][0] - points[3][0]);
		double f = (points[1][1] - points[3][1]) * points[1][0] - (points[1][0] - points[3][0]) * points[1][1];
		
		double divisor = (a * d) - (b * c);
		
		intersectingPoints[0] = ((e * d) - (b * f)) / divisor;
		intersectingPoints[1] = ((a * f) - (e * c)) / divisor;
		
		if (divisor != 0)
			return intersectingPoints;
		else
			return null;
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
	
	public static void sort(double[] list) {
		
		for (int i = 0; i < list.length - 1; i++) {
			
			double currentMin = list[i];
			int currentMinIndex = i;
			
			for (int j = i + 1; j < list.length; j++) {
				
			if (list[j] < currentMin) {
				currentMin = list[j];
				currentMinIndex = j;
				}	
			}
			
			if (currentMinIndex != i) {
				list[currentMinIndex] = list[i];
				list[i] = currentMin;
			}
		}
	}

}
