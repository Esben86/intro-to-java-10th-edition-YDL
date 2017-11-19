package ch6;
import java.util.Scanner;

public class Chapter_06_E41_ComputeBMI {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		for (;;) {
			
		System.out.println("Enter weight in kilos and height in meters: ");
		double kilos = input.nextDouble();
		if (kilos == -1)
			break;
		double meters = input.nextDouble();
		
		System.out.println("The bmi is " + computeBMI(kilos, meters));
		
		}
	}
	
	public static double computeBMI(double kilos, double meters) {
	
		return kilos / Math.pow(meters, 2);
		
	}

}
