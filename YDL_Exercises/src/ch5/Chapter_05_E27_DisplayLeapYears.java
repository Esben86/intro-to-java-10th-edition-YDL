package ch5;

/**
 * Chapter 5 Exercise 27:
 *
 * (Display leap years)
 *      
 * Write a program that displays all the leap years,
 * ten per line, from 101 to 2100, separated by exactly one space. Also
 * display the number of leap years in this period.
 *
 */

public class Chapter_05_E27_DisplayLeapYears {

	public static void main(String[] args) {

		int counter = 1;
		
		for (int i = 2014; i <= 2114; i++) {
			
			if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0) {
				
				System.out.print(i + " ");
				
				if (counter % 10 == 0)
					System.out.println();
				
				counter++;	
			}	
		}
	}
}
