package ch7;

public class Chapter_07_E06_PrimeNumbers {

	public static void main(String[] args) {
	
		final int NUMBER_OF_PRIMES = 100; // Number of primes to display
		final int NUMBER_OF_PRIMES_PER_LINE = 10; // Display 10 primes pr line
		int[] numbers = {2}; // First prime
		int number = 2; // Starting testing for prime at 2
		
		// Search for prime numbers until the array of primes contains the first 100 primes
		while (numbers.length <= NUMBER_OF_PRIMES) {
			
			boolean isPrime = true;
			
			for (int i = 0; i < numbers.length && numbers[i] < number / 2; i++) {
				int divisor = numbers[i];
				if (number % divisor == 0) {
					isPrime = false;
					break;
				}
			}
			
			// Add number to array of primes
			if (isPrime) {
				numbers = addPrimeToArray(numbers, number);
				System.out.print((numbers.length - 1) % NUMBER_OF_PRIMES_PER_LINE != 0 ? number + " " : number + "\n" );	
			}
			// Increment number and check if next number is a prime
			number++;
		}
	}
	
		
	public static int[] addPrimeToArray(int[] source, int primeNumber) {
		
		int[] dest = new int[source.length + 1];
		System.arraycopy(source, 0, dest, 0, source.length);
		dest[source.length] = primeNumber;
		return dest;
		
	}	
}
