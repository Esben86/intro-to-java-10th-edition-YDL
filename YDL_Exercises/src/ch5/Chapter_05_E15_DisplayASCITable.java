package ch5;

/**
 * Chapter 5 Exercise 15:
 *
 * (Display the ASCII character table)
 * 
 * Write a program that prints the characters in the ASCII
 * character table from ! to ~. Display ten characters per line.
 * The ASCII table is shown in Appendix B.
 * Characters are separated by exactly one space.
 *
 */

public class Chapter_05_E15_DisplayASCITable {

	public static void main(String[] args) {
		
		int linecounter = 1;
		
		for (int i = 33; i <= 126; i++) {
			System.out.print(linecounter++ % 10 != 0 ? (char) i + " " : (char) i + "\n");
		}

	}

}
