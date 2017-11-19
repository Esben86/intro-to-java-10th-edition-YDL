package ch12;
import java.io.*;
import java.util.*;

/**
 * Chapter 12 Exercise 11:
 *
 *      (Remove text)
 *      Write a program that removes all the occurrences of a specified string from a text file.
 *      For example, invoking java Exercise12_11 John filename
 *      removes the string John from the specified file.
 *      Your program should get the arguments from the command line.
 *
 */

public class Chapter_12_E11_RemoveText {

	public static void main(String[] args) throws Exception {
		
		if (args.length != 2) {
			System.out.println("Usage java ch12.Chapter_12_E11_RemoveText inputString filename");
			System.exit(1);
		}
		
		File filename = new File(args[1]);
		if (!filename.exists()) {
			System.out.println("Target file " + args[1] + " does not exist");
			System.exit(2);
		}
		
		String s = "";
		
		try (
			Scanner input = new Scanner(filename);	
		) {
						
			while (input.hasNext()) {
				s += input.nextLine();
				System.out.println("String fetched from input.nextLine() " + s);
			}
			System.out.println("Attemping to replace all words equal to " + args[0] + " with \"\"");
			s = s.replaceAll(args[0], "");
		}
		
		try (
			PrintWriter output = new PrintWriter(filename);	
			) {
				output.println(s);
			}
		
	}
}
