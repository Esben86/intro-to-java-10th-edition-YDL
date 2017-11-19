package ch12;

public class Chapter_12_E05_IllegalTriangleException {

	public static void main(String[] args) throws IllegalTriangleException {
		
		try {
			Triangle t1 = new Triangle(1, 2, 2, "red", true);
			Triangle t2 = new Triangle(1, 0, 2, "red", true);
		}
		catch (IllegalTriangleException ex) {
			System.out.println(ex.getMessage());
		}
		
		System.out.println(Triangle.getNumberOfObjects());
		
	}

}
