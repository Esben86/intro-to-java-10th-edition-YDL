package ch3;
import java.util.Scanner;

/**
 * Chapter 3 Exercise 17:
 * 
 * (Game: rock, paper, scissor)
 * 
 */

public class Chapter_03_E17_RockPaperScissors {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int computer = (int)(Math.random() * 3);
		int you = (int)(Math.random() * 3);
		
		if (computer == 0)
			System.out.print("Computer is scissor.");
		else if (computer == 1)
			System.out.print("Computer is rock.");
		else
			System.out.print("Computer is paper.");
		
		if (you == 0)
			System.out.print(" You are scissor.");
		else if (you == 1)
			System.out.print(" You are rock.");
		else
			System.out.print(" You are paper.");
		
		if (computer == you)
			System.out.print(" It is a draw");
		else if (computer == 0 && you == 1)
			System.out.println(" You win");
		else if (computer == 1 && you == 0)
			System.out.println(" Computer wins");
		else if (computer == 0 && you == 2)
			System.out.println(" Computer wins");
		else if (computer == 2 && you == 0)
			System.out.println(" You win");
		else if (computer == 1 && you == 2)
			System.out.println(" You win");
		else
			System.out.println(" Computer wins");

	}

}
