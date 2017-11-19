package ch6;

public class Chapter_06_E26_PalindromicPrime {

	public static void main(String[] args) {
		
		int count = 1;
		int n = 2;
		
		while (count <= 120) {
			if (isPrime(n) && isPalindrome(n)){
				System.out.print(count++ % 10 != 0 ? n + " " : n + "\n");
			}
			n++;
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
	
	public static int reverse(int n) {
		
		int reverse = 0;
		
		while (n > 0) {
			
			reverse *= 10;
			reverse += n % 10;
			n /= 10;
			
		}
		return reverse;
	}
	
	public static boolean isPalindrome(int n) {
		return n == reverse(n);
	}

}
