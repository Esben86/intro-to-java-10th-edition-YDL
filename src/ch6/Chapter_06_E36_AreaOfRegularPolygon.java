package ch6;
import java.util.Scanner;

public class Chapter_06_E36_AreaOfRegularPolygon {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of sides: ");
		int n = input.nextInt();
		
		System.out.println("Enter the side: ");
		double side = input.nextDouble();
		
		System.out.println("The area of the polygon is " + areaOfPolygon(n, side));

	}
	
	public static double areaOfPolygon(int n, double sides) {
		return ((n * Math.pow(sides, 2)) / (4 * Math.tan(Math.PI / n)));
	}

}
