package ch5;
import java.util.Scanner;

/**
 * Chapter 5 Exercise 34:
 *
 * (Game: scissor, rock, paper)
 *      
 * Programming Exercise 3.17 gives a program that
 * plays the scissor-rock-paper game. Revise the program to
 * let the user continuously play until either the user or the computer
 * wins more than two times than its opponent.
 *
 */

public class Chapter_05_E34_RockPaperScissors {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int playerScore = 0;
		int computerScore = 0;
		
		while (Math.abs(computerScore - playerScore ) != 3) {
			
		System.out.println("The score is Player(" + playerScore + ") Computer(" + computerScore + ")\n");	
		
		System.out.println("Choose (0)Rock, (1)Paper, (2)Scissors: ");
		int player = input.nextInt();
		if (player > 2 || player < 0) {
			System.out.println("Invalid input. Choose (0)Rock, (1)Paper, (2)Scissors: ");
			player  = input.nextInt();
		}
		
		int computer = (int)(Math.random() * 3);
				
		if (computer == 0)
			System.out.print("Computer is scissor.");
		else if (computer == 1)
			System.out.print("Computer is rock.");
		else
			System.out.print("Computer is paper.");
		
		if (player  == 0)
			System.out.print(" You are scissor.");
		else if (player  == 1)
			System.out.print(" You are rock.");
		else
			System.out.print(" You are paper.");
		
		if (computer == player )
			System.out.print(" It is a draw.\n");
		else if (computer == 0 && player  == 1) {
			System.out.println(" You win.\n");
			playerScore++;
		}
		else if (computer == 1 && player  == 0) {
			System.out.println(" Computer wins.\n");
			computerScore++;
		}	
		else if (computer == 0 && player  == 2) {
			System.out.println(" Computer wins.\n");
			computerScore++;
		}
		else if (computer == 2 && player  == 0) {
			System.out.println(" You win.\n");
			playerScore++;
		}	
		else if (computer == 1 && player  == 2) {
			System.out.println(" You win.\n");
			playerScore++;
		}
		else {
			System.out.println(" Computer wins.\n");
			computerScore++;
		}	
		}
		System.out.println("Final score is Player(" + playerScore + ") Computer(" + computerScore + ")\n");
		System.out.println(computerScore < playerScore ? "You win!" : "Computer wins!");
	}
}
