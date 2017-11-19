package ch18;

/**
 * Chapter 18 Exercise 7
 * (Fibonacci series)
 * 
 * Modify Listing 18.2, ComputeFibonacci.java, so that the
 * program finds the number of times the fib method is called.
 *
 */

public class Chapter_18_E07_CountFib {
	
	static int count = 0;
	
	public static void main(String[] args) {
		
		fib(4);
		
		System.out.println(count);

	}
	
	public static int fib(int index) {
		
		count++;
		
		if (index == 0 || index == 1) {
			return 1;
		} else {
			return fib(index - 2) + fib(index - 1);
		}
				
	}

}
