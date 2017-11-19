package ch13;

/**
 * Chapter 13 Exercise 7:
 *
 *      (The Colorable interface)
 *      Design an interface named Colorable with a void method named howToColor().
 *      Every class of a colorable object must imple- ment the Colorable interface.
 *      Design a class named Square that extends GeometricObject and implements Colorable.
 *      Implement howToColor to display the message Color all four sides.
 *      Draw a UML diagram that involves Colorable, Square, and GeometricObject.
 *      Write a test program that creates an array of five GeometricObjects.
 *      For each object in the array, display its area and invoke its howToColor method
 *      if it is colorable.
 *
 */

public class Chapter_13_E07_TheColorableInterface {

	public static void main(String[] args) {
		
		GeometricObject[] shapes = {new Square(6),
									new Square(2),
									new Triangle(2, 2, 2),
									new Square(3)};
		
		for (GeometricObject shape: shapes) {
			System.out.println(shape.getArea());
			
			if (shape instanceof Colorable)
				((Colorable) shape).howToColor();
			
			
		}
		
	}

}
