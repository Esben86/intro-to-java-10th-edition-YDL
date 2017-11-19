package ch1;

/**
 * Chapter 1 Exercise 9:
 *
 *      (Area and perimeter of a rectangle) Write a program that displays the area and perimeter
 *       of a rectangle with the width of 5.3 and height of 8.6
 * 
 */

public class Chapter_01_E09_AreaAndPerimiterOfARectangle {

	public static void main(String[] args) {
		
		double width = 5.3;
		double height = 8.6;
		
		double perimiter = 2 * (width + height);
		double area = width * height;
		
		System.out.println("The perimiter is: " + perimiter + " and the area is: " + area);

	}

}
