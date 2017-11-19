package ch3;
import java.util.Scanner;

/**
 * Chapter 3 Exercise 24:
 *
 * (Game: pick a card)
 *
 */

public class Chapter_03_E24_PickACard {

	public static void main(String[] args) {
		
		int cardPick = (int)(Math.random() * 52);
		
		// Determine rank
		if (cardPick % 13 == 0)
			System.out.print("Ace");
		else if (cardPick % 13 == 1)
			System.out.print("Two");
		else if (cardPick % 13 == 2)
			System.out.print("Three");
		else if (cardPick % 13 == 3)
			System.out.print("Four");
		else if (cardPick % 13 == 4)
			System.out.print("Five");
		else if (cardPick % 13 == 5)
			System.out.print("Six");
		else if (cardPick % 13 == 6)
			System.out.print("Seven");
		else if (cardPick % 13 == 7)
			System.out.print("Eight");
		else if (cardPick % 13 == 8)
			System.out.print("Nine");
		else if (cardPick % 13 == 9)
			System.out.print("Ten");
		else if (cardPick % 13 == 10)
			System.out.print("Jack");
		else if (cardPick % 13 == 11)
			System.out.print("Queen");
		else if (cardPick % 13 == 12)
			System.out.print("King");
		
		// Determine suit
		if (cardPick / 13 == 0)
			System.out.print(" of Clubs");
		else if (cardPick / 13 == 1)
			System.out.print(" of Diamonds");
		else if (cardPick / 13 == 2)
			System.out.print(" of Hearts");
		else
			System.out.print(" of Spades");
		

	}

}
