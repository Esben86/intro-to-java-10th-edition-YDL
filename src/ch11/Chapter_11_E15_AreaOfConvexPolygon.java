package ch11;
import java.util.ArrayList;
import java.util.Scanner;

public class Chapter_11_E15_AreaOfConvexPolygon {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		ArrayList<Double> list = new ArrayList<>();
		
		System.out.println("Enter the number of points: ");
		int numberOfPoints = input.nextInt();
		
		System.out.println("Enter the points: ");
		for (int i = 0; i < numberOfPoints * 2; i++)
			list.add(input.nextDouble());
						
		System.out.println("The area is " + calculateArea(list));				
		
	}
	
	public static double calculateArea(ArrayList<Double> list) {
		
		double xNyN = 0;
		double yNxN = 0;
		
		for (int i = 1; i < list.size(); i+= 3) {
			int j = (i + 2) % list.size();
			i--;
			xNyN += (list.get(i) * list.get(j));
		}
		
		for (int i = 1; i < list.size(); i+= 2) {
			int j = (i + 1) % list.size();
			yNxN += (list.get(i) * list.get(j));
		}
		double area = 0.5 * (xNyN - yNxN);
		return (area < 0) ? -area: area;
	}

}
