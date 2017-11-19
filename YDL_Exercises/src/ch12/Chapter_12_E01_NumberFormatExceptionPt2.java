package ch12;
import java.util.ArrayList;

/**
 * Chapter 12 Exercise 1, part 2:
 *
 *      Listing 7.9, Calculator.java, is a simple commandline calculator.
 *      Note that the program terminates if any operand is nonnumeric.
 *      Write a program with an exception handler that deals with nonnumeric
 *      operands; then write another program without using an exception handler
 *      to achieve the same objective. Your program should display a message that
 *      informs the user of the wrong operand type before exiting (see Figure 12.12).
 *      
 */

public class Chapter_12_E01_NumberFormatExceptionPt2 {

	public static void main(String[] args) {
						
		// Check number of string passed
		if (args.length != 3) {
			System.out.println("Usage: java Calculator operand1 operator operand2");
			System.exit(0);
		}
					
		// The result of the operation
		int result = 0;
		
		if (invalidString(args).size() > 0) {
			ArrayList<String> invalidStrings = invalidString(args);
			
			System.out.print("Wrong input: ");
			for (int i = 0; i < invalidStrings.size(); i++) 
				System.out.print(invalidStrings.get(i) + " ");	
			
			System.exit(0);	
		}
		
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
	
	public static ArrayList<String> invalidString(String[] args) {
		
		ArrayList<String> invalidString = new ArrayList<>();
		
		for (int i = 0; i < args[0].length(); i++) {
			if (!Character.isDigit(args[0].charAt(i))) {
				invalidString.add(args[0]);
				break;
			}
		}
		
		for (int i = 0; i < args[2].length(); i++) {
			if (!Character.isDigit(args[2].charAt(i))) {
				invalidString.add(args[2]);
				break;
			}	
		}
		return invalidString;
	}

}
