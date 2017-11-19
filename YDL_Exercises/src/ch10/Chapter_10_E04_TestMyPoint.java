package ch10;

public class Chapter_10_E04_TestMyPoint {

	public static void main(String[] args) {
		
		MyPoint p1 = new MyPoint();
		MyPoint p2 = new MyPoint(10, 30.5);
		
		System.out.println("X and Y for p1 = " + p1.getX() + " and " + p1.getY());
		System.out.println("X and Y for p2 = " + p2.getX() + " and " + p2.getY());
		
		System.out.println();
		
		System.out.println("Distance between p1 and p2: ");
		System.out.println(p1.distance(p2));
		System.out.println(p2.distance(p1));
		
		System.out.println();
		
		System.out.println(p1.distance(10, 30.5));
		System.out.println(p2.distance(0, 0));
		
		System.out.println();
		
		System.out.println(p1.distance(new MyPoint(1, 4)));
		System.out.println(p2.distance(new MyPoint(8, 8)));

	}

}
