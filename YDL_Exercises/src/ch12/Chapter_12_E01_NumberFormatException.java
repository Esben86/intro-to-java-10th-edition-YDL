package ch12;

/**
 * Chapter 12 Exercise 1, part 1:
 *
 *      Listing 7.9, Calculator.java, is a simple command line calculator.
 *      Note that the program terminates if any operand is non numeric.
 *      Write a program with an exception handler that deals with non numeric
 *      operands; then write another program without using an exception handler
 *      to achieve the same objective. Your program should display a message that
 *      informs the user of the wrong operand type before exiting (see Figure 12.12).
 *
 */

public class Chapter_12_E01_NumberFormatException {

	public static void main(String[] args) {
						
		try {
			// Check number of string passed
			if (args.length != 3) {
				System.out.println("Usage: java Calculator operand1 operator operand2");
				System.exit(0);
			}
					
			// The result of the operation
			int result = 0;
			
			// Determine the operator
			switch (args[1].charAt(0)) {
				case '+': result = Integer.parseInt(args[0]) + Integer.parseInt(args[2]); break;
						  	
				case '-': result = Integer.parseInt(args[0]) - Integer.parseInt(args[2]); break;
				
				case '.': result = Integer.parseInt(args[0]) * Integer.parseInt(args[2]); break;
				
				case '/': result = Integer.parseInt(args[0]) / Integer.parseInt(args[2]); break;
						
			}
			// Display result
			System.out.println(args[0] + ' ' + args[1] + ' ' + args[2] + " = " + result);
		}
		
		catch (NumberFormatException ex) {					
			System.out.println("Wrong input: " + ex.getMessage());
			System.exit(0);
		}
			
	}
}
