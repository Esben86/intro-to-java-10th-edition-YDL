package ch6;

public class Chapter_06_E29_TwinPrimes {

	public static void main(String[] args) {

		for (int i = 2; i <= 1200; i++) {
			
			if (isPrime(i) & isPrime(i + 2))
				System.out.println("(" + i + ", " + (i + 2) + ")");
			
		}
	}
	
	public static boolean isPrime(int n) {
		
		for (int divisor = 2; divisor <= n / 2; divisor++) {
			if (n % divisor == 0) {
				return false;
			}
		}
		return true;
	}

}
