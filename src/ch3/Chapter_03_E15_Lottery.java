package ch3;
import java.util.Scanner;

/**
 * Chapter 3 Exercise 15:
 *
 * (Game: lottery)
 *
 */

public class Chapter_03_E15_Lottery {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int lottery = (int)(100 + Math.random() * 900);
		
		System.out.println("Enter your lottery pick (three digits): ");
		int guess = input.nextInt();
		
		int lotteryDigit1 = lottery / 100;
		int lotteryDigit2 = lottery % 100 / 10;
		int lotteryDigit3 = lottery % 10;
		
		int guessDigit1 = guess / 100;
		int guessDigit2 = guess % 100 / 10;
		int guessDigit3 = guess % 10;;
		
		System.out.println("guessDigit 1 is " + guessDigit1);
		System.out.println("guessDigit 2 is " + guessDigit2);
		System.out.println("guessDigit 3 is " + guessDigit3);
		
		System.out.println("lotteryDigit 1 is " + lotteryDigit1);
		System.out.println("lotteryDigit 2 is " + lotteryDigit2);
		System.out.println("lotteryDigit 3 is " + lotteryDigit3);
		
		System.out.println("The lottery number is: " + lottery);
		
		if (guess == lottery)
			System.out.println("Exact match: you win $12,000");
		
		else if ((guessDigit1 == lotteryDigit1 && guessDigit2 == lotteryDigit3 && guessDigit3 == lotteryDigit2) ||
				 (guessDigit1 == lotteryDigit2 && guessDigit2 == lotteryDigit1 && guessDigit3 == lotteryDigit3) ||
				 (guessDigit1 == lotteryDigit2 && guessDigit2 == lotteryDigit3 && guessDigit3 == lotteryDigit1) ||
				 (guessDigit1 == lotteryDigit3 && guessDigit2 == lotteryDigit2 && guessDigit3 == lotteryDigit1) ||
				 (guessDigit1 == lotteryDigit3 && guessDigit2 == lotteryDigit1 && guessDigit3 == lotteryDigit2))
			System.out.println("Match all digits: you win $5,000");
		else if ((guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2 || guessDigit1 == lotteryDigit3) ||
				 (guessDigit2 == lotteryDigit1 || guessDigit2 == lotteryDigit2 || guessDigit2 == lotteryDigit3) ||
				 (guessDigit3 == lotteryDigit1 || guessDigit3 == lotteryDigit2 || guessDigit3 == lotteryDigit3))
			System.out.println("Match one digit: you win $2,000");
		else
			System.out.println("Sorry, not match");

	}

}
