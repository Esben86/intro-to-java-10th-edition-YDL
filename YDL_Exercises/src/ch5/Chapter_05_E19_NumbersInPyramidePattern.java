package ch5;


/**
 * Chapter 5 Exercise 19:
 *
 * (Display numbers in a pyramid pattern)
 *
 */

public class Chapter_05_E19_NumbersInPyramidePattern {

	public static void main(String[] args) {
			
		for (int rows = 1; rows <= 8; rows++) {
			int startInteger = 1;
			for (int spaces = 7; spaces >= rows; spaces--) {
				System.out.printf("%6s", "");
			}
			
			for (int increasingNumbers = 1; increasingNumbers <= rows; increasingNumbers++) {
				System.out.printf("%-6d", startInteger);
				startInteger *= 3;
			}
			
			startInteger /= 3;
			startInteger /= 3;
			
			for (int decreasingNumbers = 2; decreasingNumbers <= rows; decreasingNumbers++) {
				System.out.printf("%-6d", startInteger);
				startInteger /= 3;
			}
			System.out.println();
		}
	}

}
