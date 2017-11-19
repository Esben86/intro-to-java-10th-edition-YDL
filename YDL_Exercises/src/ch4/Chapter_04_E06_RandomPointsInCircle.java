package ch4;

/**
 * Chapter 4 Exercise 6:
 *
 * (Random points on a circle)
 * Write a program that generates three random points on a circle centered at (0, 0)
 * with radius 40 and display three angles in a triangle formed by these three points
 *
 * A random point on the circle can be generated using a random angle α
 * x = r × cos(α) and y = r × sin(α)
 *
 */

public class Chapter_04_E06_RandomPointsInCircle {

	public static void main(String[] args) {
		
		double randomAngle = Math.random() * 2 * Math.PI;
		double r = 40;
		
		double x = r * Math.cos(randomAngle);
		double y = r * Math.sin(randomAngle);
		
		System.out.println("X = " + x + " and Y = " + y);

	}

}
