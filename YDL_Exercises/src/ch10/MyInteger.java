package ch10;

public class MyInteger {
	
	private int value;
	
	public MyInteger(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
	
	public boolean isOdd() {
		return (value % 2 != 0);
	}
	
	public boolean isEven() {
		return (value % 2 == 0);
	}
	
	public boolean isPrime() {
		for (int i = 2; i < value / 2; i++) {
			if (value % i == 0)
				return false;
		}
		return true;
	}
	
	public static boolean isOdd(int value) {
		return (value % 2 != 0);
	}
	
	public static boolean isEven(int value) {
		return (value % 2 == 0);
	}
	
	public static boolean isPrime(int value) {
		for (int i = 2; i < value / 2; i++) {
			if (value % i == 0)
				return false;
		}
		return true;
	}
	
	public static boolean isOdd(MyInteger intValue) {
		return (intValue.getValue() % 2 != 0);
	}
	
	public static boolean isEven(MyInteger intValue) {
		return (intValue.getValue() % 2 == 0);
	}
	
	public static boolean isPrime(MyInteger intValue) {
		for (int i = 2; i < intValue.getValue() / 2; i++) {
			if (intValue.getValue() % i == 0)
				return false;
		}
		return true;
	}
	
	public boolean equals(int value) {
		return this.value == value;
	}
	
	public boolean equals(MyInteger intValue) {
		return this.value == intValue.getValue();
	}
	
	public static int parseInt(char[] charArray) {
		
		int value = charArray[0] - 48;
		
		for (int i = 1; i < charArray.length; i++) {
			value *= 10;
			value += charArray[i] - 48;
		}
		return value;
	}
	
	public static int parseInt(String s) {
		
		int value = s.charAt(0) - 48;
		
		for (int i = 1; i < s.length(); i++) {
			value *= 10;
			value += s.charAt(i) - 48;
		}
		return value;
	}
	

}
