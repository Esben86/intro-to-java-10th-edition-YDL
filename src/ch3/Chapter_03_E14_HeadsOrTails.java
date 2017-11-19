package ch3;
import java.util.Scanner;

/**
 * Chapter 3 Exercise 14:
 *
 * (Game: heads or tails)
 *
 */

public class Chapter_03_E14_HeadsOrTails {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Heads (0) or Tails (1) ?");
		
		int guess = input.nextInt();
		
		int headsOrTails = (int)(Math.random() * 2);
		
		if (headsOrTails == 0)
			System.out.println("Heads");
		else
			System.out.println("Tails");
		
		if (headsOrTails == guess)
			System.out.println("You got it right!");
		else
			System.out.println("Wrong guess");
		
		
		

	}

}
