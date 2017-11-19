package ch10;

public class Chapter_10_E06_DisplayPrimeNumbers {

	public static void main(String[] args) {
		
		StackOfIntegers stack = new StackOfIntegers();
		
		for (int i = 120; i >= 2; i--) {
			boolean isPrime = true;
			for (int divisor = 2; divisor <= i / 2; divisor++) {
				
				if (i % divisor == 0) {
					isPrime = false;
					break;
				}	
			}
			if (isPrime)
				stack.push(i);
		}
		
		while (!stack.empty())
			System.out.print(stack.pop() + " ");
	}
}
