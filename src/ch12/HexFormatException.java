package ch12;

public class HexFormatException extends Exception {
	
	public HexFormatException() {
		super("Invalid hex string. Must contain only characters from a-f, A-F and 0-9.");
	}
	
	public HexFormatException(String message) {
		super(message);
	}
	
	public String toString() {
		return "" + super.getMessage();
	}

}
