package ch5;
import java.util.Scanner;

/**
 * Chapter 5 Exercise 32:
 *
 * (Game: lottery)
 *      
 * Revise Listing 3.8, Lottery.java, to generate a
 * lottery of a two- digit number. The two digits in the number are distinct.
 * (Hint: Generate the first digit. Use a loop to continuously generate
 * the second digit until it is different from the first digit.)
 *
 */

public class Chapter_05_E32_Lottery {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
						
		System.out.println("Enter your lottery pick (three digits): ");
		int guess = input.nextInt();
		
		int lotteryDigit1 = (int)(Math.random() * 4);
		int lotteryDigit2 = (int)(Math.random() * 4);
		
		while (lotteryDigit1 == lotteryDigit2)
			lotteryDigit2 = (int)(Math.random() * 4);
				
		int guessDigit1 = guess / 10;
		int guessDigit2 = guess % 10;
							
		System.out.println("The lottery number is: " + lotteryDigit1 + "" + lotteryDigit2);
		
		if (guessDigit1 == lotteryDigit1 && guessDigit2 == lotteryDigit2)
			System.out.println("Exact match: you win $12,000");
		
		else if ((guessDigit1 == lotteryDigit2 && guessDigit2 == lotteryDigit1))
			System.out.println("Match all digits: you win $5,000");
		
		else if ((guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2 ||
				  guessDigit2 == lotteryDigit1 || guessDigit2 == lotteryDigit2))
			System.out.println("Match one digit: you win $2,000");
		else
			System.out.println("Sorry, not match");
	}
}
