package ch12;

public class IllegalTriangleException extends Exception {
	
	public IllegalTriangleException() {
		System.out.println("Invalid triangle");	
	}
	
	public IllegalTriangleException(String message) {
		super(message);
	}
		
}
