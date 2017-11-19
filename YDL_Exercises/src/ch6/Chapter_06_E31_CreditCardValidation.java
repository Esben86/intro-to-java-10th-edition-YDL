package ch6;
import java.util.Scanner;

public class Chapter_06_E31_CreditCardValidation {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a credit card number as a long integer: ");
		long n = input.nextLong();
					
		System.out.println(n + " " + (isValid(n) ? "is valid" : "is not valid"));
			
	}
	
	/** Return the number of digits in d */
	public static int getDigit(int number) {
		
		if (number > 9) {
			return (number % 10) + (number / 10);
		}
		return number;
	}
	
	/** Get the result from step2 */
	public static int sumOfDoubleEvenPlace(long number) {
		
		int sumOfDoubleEven = 0;
		int count = 0;
		while (number > 0) {
			number /= 10;
			if (count % 2 == 0) {			
				sumOfDoubleEven += getDigit((int) (number % 10) * 2);
			}
			count++;		
		}
		return sumOfDoubleEven;	
	}
	
	/** Return sum of odd-place digits */	
	public static int sumOfOddPlace(long number) {
		
		int sumOfOdd = 0;
				
		while (number > 0) {
			System.out.println("Extracted odd number: " + number % 10);
			sumOfOdd += getDigit((int) (number % 10));
			number /= 100;	
			}
		return sumOfOdd;			
	}
	
	/** Return the size of digits in d */
	public static int getSize(long d) {
		
		int size = 0;
		
		while (d != 0) {
			size++;
			d /= 10;
		}
		return size;
	}
	
	/** Return the first k number of digits from number. If the
	 * number of digits in number is less than k, return number. */
	public static long getPrefix(long number, int k) {
		
		int size = getSize(number);
		if (size < k) return number;
		
		long prefix = 0;
		
		for (int i = size - 1; i > 0; i--) {
			if (getSize(prefix) == k) return prefix;
			
			long divisor = 1;
			prefix *= 10;
			for (int j = i; j > 0; j--) {
				divisor *= 10;
			}
			prefix += (number / divisor) % 10;
		}
		prefix += number % 10;
		return prefix;
	}
	
	/** Return true if the digit d is a prefix for number */
	public static boolean prefixMatched(long number, int d) {
		return d == getPrefix(number, getSize(d));
	}
	
	/** Return true of the card number is valid */
	public static boolean isValid(long number) {
		
		if (getSize(number) < 13 || getSize(number) > 16) return false;
		
		if (!(prefixMatched(number, 4) || prefixMatched(number,5) || prefixMatched(number, 6) || prefixMatched(number, 37)))
				return false;
				
		if ((sumOfDoubleEvenPlace(number) + sumOfOddPlace(number)) % 10 != 0)
			return false;
				
		return true;
	}
}
