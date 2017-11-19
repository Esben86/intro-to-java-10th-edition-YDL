package ch12;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

/**
 * Chapter 12 Exercise 31:
 *
 *      (Baby name popularity ranking)
 *      The popularity ranking of baby names from years 2001 to 2010 is downloaded
 *      from www.ssa.gov/oact/babynames and stored in files named babynameranking2001.txt,
 *      babynameranking2002.txt, . . . , babynameranking2010.txt. Each file contains one thousand
 *      lines. Each line contains a ranking, a boy’s name, number for the boy’s name, a girl’s name,
 *      and number for the girl’s name. For example, the first two lines in the file
 *      babynameranking2010.txt are as follows:
 *
 *      So, the boy’s name Jacob and girl’s name Isabella are ranked #1 and the boy’s name
 *      Ethan and girl’s name Sophia are ranked #2. 21,875 boys are named Jacob and 22,731
 *      girls are named Isabella. Write a program that prompts the user to enter the year, gender,
 *      and followed by a name, and displays the ranking of the name for the year.
 *
 */

public class Chapter_12_E31_BabyNameRanking {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the year: ");
		String year = input.next();
		
		/**
		 *  System.out.println("Enter the gender (M/F)");
		 *	String gender = input.next();
		 *	(Gender input not needed)
		 */
		
		System.out.println("Enter the name: ");
		String name = input.next();
				
		try {
			URL url = new URL("http://cs.armstrong.edu/liang/data/babynamesranking" + year + ".txt");
			input = new Scanner(url.openStream());
			
			while (input.hasNext()) {
				String line = input.nextLine();
				
				if (line.contains(name)) {
					
					String[] tokens = line.split("\\s+");
					
					for (String token: tokens) {
						if (token.matches(name)) {
							System.out.println(name + " is ranked #" + tokens[0] + " in year " + year);
							System.exit(0);
						} 
					}	
				}
			}	
			System.out.println("The name " + name + " is not ranked in year " + year);
			input.close();
			
		} catch (IOException ex) {
			ex.printStackTrace();
		} 

	}

}
