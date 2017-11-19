package ch7;
import java.util.Scanner;

public class Chapter_07_E35_Hangman {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
				
		char guess, choice;
		int missedGuesses = 0;
		
		do {
		
			String secretWord = getWord();
			boolean[] foundLetter = new boolean[secretWord.length()];
			int remainingLetters = secretWord.length();
					
			while (remainingLetters > 0) {
				
				boolean found = false;	
				boolean alreadyGuessed = false;
				
				System.out.println("Guess a letter: ");
			
				printWord(secretWord, foundLetter);
									
				guess = input.next().charAt(0);
			
				for (int i = 0; i < secretWord.length(); i++) {
				
					if (guess == secretWord.charAt(i) && !foundLetter[i]) {
						foundLetter[i] = true;
						found = true;
						remainingLetters--;
					} else if (guess == secretWord.charAt(i) && foundLetter[i]) {
						found = true;
						alreadyGuessed = true;
					}
				}
				
				if (!found) {
					missedGuesses++;
					System.out.println(guess + " is not in the word");
				}
				
				if(alreadyGuessed)
					System.out.println(guess + " is already found");
			}
		
		System.out.println("The secret word is " + secretWord);
		System.out.println("You made " + missedGuesses + " wrong guesses");
		System.out.println("Do you want to play again? (y/n)");
		choice = input.next().charAt(0);
		
		} while (choice == 'y');
		
	}
	
	public static String getWord() {
		
		String[] words = {"Jeddi", "Liverpool", "Kid Rock", "Crossbone", "Joikaboller", "Boomslang", "Candyflipper", 
						  "Sithlord", "Knugern"};
		
		int wordIndex = (int)(Math.random() * words.length);
		
		return words[wordIndex];
		
	}
	
	public static void printWord(String secretWord, boolean[] foundLetter) {
		
		for (int i = 0; i < secretWord.length(); i++) {
			
			if (foundLetter[i])
				System.out.print(secretWord.charAt(i));
			else
				System.out.print("*");
			
		}
		System.out.println("\n>");
	}

}
