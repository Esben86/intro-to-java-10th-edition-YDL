package ch6;
import java.util.Scanner;

public class Chapter_06_E35_AreaOfPentagon {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the side: ");
		double side = input.nextDouble();
		
		System.out.println("The area of the pentagon is " + areaOfPentagon(side));

	}
	
	public static double areaOfPentagon(double side) {
		
		return (5 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / 5));
		
	}

}
