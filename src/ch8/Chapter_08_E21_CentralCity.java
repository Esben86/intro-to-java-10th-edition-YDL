package ch8;
import java.util.Scanner;

public class Chapter_08_E21_CentralCity {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of cities: ");
		int n = input.nextInt();
		
		double[][] cityCoordinates = new double[n][2];
		double[] currentCity = new double[2];
		double shortestTotalDistance = 10_000; //Initally set to 10 000
		double p1 = 0, p2 = 0;
		
		System.out.println("Enter the coordinates of the cities: ");
		for (int i = 0; i < cityCoordinates.length; i++) {
			for (int j = 0; j < cityCoordinates[i].length; j++) {
				cityCoordinates[i][j] = input.nextDouble();
			}
		}
				
		for (int i = 0; i < cityCoordinates.length; i++) {
			double totalDistance = 0;
			currentCity = cityCoordinates[i];
			
			for (int j = 0; j < cityCoordinates.length; j++) {
				totalDistance += distance(currentCity[0], currentCity[1], cityCoordinates[j][0], cityCoordinates[j][1]);
			}
			
			if (totalDistance < shortestTotalDistance) {
				shortestTotalDistance = totalDistance;
				p1 = currentCity[0];
				p2 = currentCity[1];
			}	
		}
		
		System.out.println("The central city is at (" + p1 + ", " + p2 + ")");
		System.out.printf("The total distance to all other cities is %.2f", shortestTotalDistance);

	}
	
	public static double distance(double x1, double y1, double x2, double y2) {
		return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
	}

}
