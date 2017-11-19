package ch10;

public class Chapter_10_E03_TestMyInteger {

	public static void main(String[] args) {
		
		MyInteger int1 = new MyInteger(11);
		
		System.out.println(int1.getValue()); // Test 1 +getInt(): int
		
		System.out.println(int1.isOdd()); // Test 2 +isOdd(): boolean
		System.out.println(int1.isEven()); // Test 3 +isEven(): boolean
		System.out.println(int1.isPrime()); // Test 4 +isPrime(): boolean
		
		System.out.println(MyInteger.isOdd(3)); // Test 5 +isOdd(value: int): boolean
		System.out.println(MyInteger.isEven(4)); // Test 6 +isEven(value: int): boolean
		System.out.println(MyInteger.isPrime(113)); // Test 7 +isPrime(value: int): boolean
		
		System.out.println(MyInteger.isOdd(new MyInteger(4))); // Test 8 +isOdd(intValue: MyInteger): boolean
		System.out.println(MyInteger.isEven(new MyInteger(3))); // Test 9 +isEven(intValue: MyInteger): boolean
		System.out.println(MyInteger.isPrime(new MyInteger(12))); // Test 10 +isPrime(intValue: MyInteger): boolean
		
		System.out.println(int1.equals(11)); // Test 11 +equals(value: int): boolean
		System.out.println(int1.equals(new MyInteger(11))); // Test 12 +equals(intValue: MyInteger): boolean
		
		System.out.println(MyInteger.parseInt("1337".toCharArray())); // Test 13 +parseInt(charArray: char[]): int
		System.out.println(MyInteger.parseInt("1337")); // Test 14 +parseInt(s: String): int

	}

}
