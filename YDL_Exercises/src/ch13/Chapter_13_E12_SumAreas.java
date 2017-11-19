package ch13;

/**
 * Chapter 13 Exercise 12:
 *
 *      (Sum the areas of geometric objects)
 *      Write a method that sums the areas of all the geometric objects in an array.
 *      The method signature is:
 *
 *      public static double sumArea(GeometricObject[] a)
 *
 *      Write a test program that creates an array of four objects (two circles and two
 *      rectangles) and computes their total area using the sumArea method.
 *
 */

public class Chapter_13_E12_SumAreas {

	public static void main(String[] args) {
		
		GeometricObject[] shapes = {new Circle(3),
									new Triangle(5, 5, 5),
									new Octagon(8),
									new Rectangle2(2, 4),
									new Square(4)						
		};
		
		System.out.println("The total area for all the GeometricObjects is " + sumArea(shapes));

	}
	
	public static double sumArea(GeometricObject[] a) {
		
		double sum = 0;
		
		for (GeometricObject shape: a) 
			sum += shape.getArea();
		
		return sum;
		
	}

}
