package ch5;

/**
 * Chapter 5 Exercise 40:
 *
 * (Simulation: heads or tails)
 * 
 * Write a program that simulates flipping a coin
 * one million times and displays the number of heads and tails.
 *
 */

public class Chapter_05_E40_HeadsOrTails {

	public static void main(String[] args) {

		int headsCount = 0;
		int tailsCount = 0;
								
		for (int i = 1; i <= 2000000; i++) {
			
			double flip = (int)(Math.random() * 2);
			
			flip = (flip == 0) ? headsCount++ : tailsCount++;
			
		}	
		System.out.println("Heads (" + headsCount + ") Tails (" + tailsCount + ")");
	}
}
