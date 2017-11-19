package ch10;

public class Chapter_10_E26_Calculator {
		
	public static void main(String[] args) {
		
		String temp = "";
		
		for (String s: args)
			temp += s;
		
		
		args = MyString1.split(temp, "[+-*/]");
		
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
}
