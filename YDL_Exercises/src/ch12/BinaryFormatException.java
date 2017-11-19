package ch12;

public class BinaryFormatException extends Exception {
	
	public BinaryFormatException() {
		super("Invalid binary string: can only consists of 0's and 1's");
	}
	
	public BinaryFormatException(String message) {
		super(message);
	}

}
