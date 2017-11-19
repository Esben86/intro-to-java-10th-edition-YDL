package ch10;

public class Chapter_10_E13_TestRectangle2D {

	public static void main(String[] args) {
		
		MyRectangle2D r1 = new MyRectangle2D(3, 2, 6.5, 5.9);
		
		System.out.println("r1 area: " + r1.getArea());
		System.out.println("r1 perimeter: " + r1.getPerimeter());
		System.out.println("Is point (4,4) inside r1? " + r1.contains(4, 4));
		System.out.println("Is new MyRectangle2D(5, 6, 11.5, 4.2) inside r1? " 
		                    + r1.contains(new MyRectangle2D(5, 6, 11.5, 4.2)));
		System.out.println("Does r1 overlap new MyRectangle2D(4, 6, 3.3, 6.4) ? " 
		                    + r1.overlaps(new MyRectangle2D(4, 6, 3.3, 6.4)));
		
	}

}
