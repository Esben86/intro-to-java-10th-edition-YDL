package ch12;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Chapter 12 Exercise 17:
 * (Game: hangman) Rewrite Programming Exercise 7.35. The program reads the
 * words stored in a text file named hangman.txt. Words are delimited by spaces.
 * 
 */

public class Chapter_12_E17_Hangman {

	public static void main(String[] args) throws FileNotFoundException {
		
		File wordFile = new File("src/ch12/files/hangman.txt");
		
		if (!wordFile.exists()) {
			System.out.println("The file containing secret words does not exist");
			System.exit(1);
		}
		
		Scanner input = new Scanner(System.in);
		char choice;
				
		do {
			
			String secretWord = getSecretWord(wordFile);
			boolean[] guessed = new boolean[secretWord.length()];
			int missedGuesses = 0, remainingCharacters = secretWord.length();
			
			while (remainingCharacters > 0) {
				
				boolean found = false, alreadyGuessed = false;
				
				printWord(guessed, secretWord);
				System.out.println("\nGuess a character: ");
				
				char guess = input.next().charAt(0);
				
				for (int i = 0; i < secretWord.length(); i++) {
					
					if (guess == secretWord.charAt(i) && !guessed[i]) {
						guessed[i] = true;
						found = true;
						remainingCharacters--;
					} else if (guess == secretWord.charAt(i) && guessed[i]) {
						alreadyGuessed = true;
						found = true;
					}
					
				}
				
				if (!found) {
					System.out.println(guess + " was not found");
					missedGuesses++;	
				}
				
				if (alreadyGuessed)
					System.out.println(guess + " has already been guessed");
			}
			
			System.out.println("The secret word is " + secretWord);
			System.out.println("You made " + missedGuesses + " wrong guesses");
			System.out.println("\nDo you want to play again? (Y/N)");
			choice = input.next().charAt(0);
						
		} while (choice == 'Y');

	}
	
	public static String getSecretWord(File wordFile) throws FileNotFoundException {
		
		Scanner input = new Scanner(wordFile);
		ArrayList<String> words = new ArrayList<>();
		
		while (input.hasNext()) {
			words.add(input.next());
		}
		
		int randomIndex = (int) (Math.random() * words.size());
		
		return words.get(randomIndex);
		
		
	}
	
	public static void printWord(boolean[] guessed, String secretWord) {
		
		for (int i = 0; i < guessed.length; i++) {
			
			if (guessed[i])
				System.out.print(secretWord.charAt(i));
			else
				System.out.print("*");
			
		}
	}

}
