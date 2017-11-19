package ch5;

/**
 * Chapter 5 Exercise 5:
 *
 * (Inches to meters)
 *
 */

public class Chapter_05_E04_InchesToMeters {

	public static void main(String[] args) {
		
		System.out.printf("%-12s %8s" ,"Inches" , "Centimeters\n");
		
		for (int i = 1; i <= 10; i++) 
			System.out.printf("%-12d %11.2f\n" ,i ,i * 2.54);

	}

}
