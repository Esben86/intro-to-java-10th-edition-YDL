package ch5;

/**
 * Chapter 5 Exercise 5:
 *
 *  (Celsius to Fahrenheit)
 */

public class Chapter_05_E05_CtoFandFtoC {

	public static void main(String[] args) {
		
		System.out.printf("%-12s %8s", "Celsius", "Fahrentheit");
		System.out.printf("\t|\t");
		System.out.printf("%-12s %9s", "Fahrenheit", "Celsius\n");
		
		for (int celsius = 0, fahrenheit = 20; celsius <= 100; celsius += 2, fahrenheit +=5) {
			System.out.printf("%-12d %11.3f", celsius, ((celsius * 9.0) / 5.0) + 32);
			System.out.printf("\t|\t");
			System.out.printf("%-12d %8.3f\n", fahrenheit, ((fahrenheit - 32) * (5.0 / 9)));
			
		}
		
	}
	
}
