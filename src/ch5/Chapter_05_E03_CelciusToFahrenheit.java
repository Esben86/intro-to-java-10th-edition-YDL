package ch5;

/**
 * Chapter 5 Exercise 3:
 *
 * (Celcius to Fahrenheit) 
 *
 */

public class Chapter_05_E03_CelciusToFahrenheit {

	public static void main(String[] args) {
		
		System.out.printf("%-12s %8s", "Celsius", "Fahrenheit\n");
		
		for (int c = 0; c <= 100; c += 2) 
			System.out.printf("%-12d %10.1f\n", c, ((c * 9.0) / 5.0) + 32);
		
	}

}
