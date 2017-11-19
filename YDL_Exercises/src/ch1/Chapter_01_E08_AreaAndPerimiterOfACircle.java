package ch1;

/**
 * Chapter 1 Exercise 8:
 *      (Area and perimeter of a circle) Write a program that displays the area and perimeter
 *      of a circle that has a radius of 6.5
 *
 */

public class Chapter_01_E08_AreaAndPerimiterOfACircle {

	public static void main(String[] args) {
		
		double pi = 3.14159;
		double radius = 6.5;
		double perimiter = 2 * radius * pi;
		double area = Math.pow(radius, 2) * pi;
		
		System.out.println("The perimiter is: " + perimiter + " and the area is: " + area);

	}

}
