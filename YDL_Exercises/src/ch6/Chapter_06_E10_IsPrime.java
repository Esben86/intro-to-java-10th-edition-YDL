package ch6;

public class Chapter_06_E10_IsPrime {

	public static void main(String[] args) {
		
		int counter = 0;
		
		for (int i = 2; i < 12000; i++) {
			
			if (isPrime(i)) {
				System.out.print(i + " ");
				counter++;
				
				if (counter % 10 == 0)
					System.out.println();
					
			}	
		}
	}
	
	public static boolean isPrime(int number) {
		
		for (int divisor = 2; divisor <= number / 2; divisor ++) {
			if (number % divisor == 0)
				return false;
		}
		return true;
	}

}
