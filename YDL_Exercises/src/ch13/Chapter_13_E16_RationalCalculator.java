package ch13;

/**
 * Chapter 13 Exercise 16:
 *
 *      (Create a rational-number calculator)
 *      Write a program similar to Listing 7.9, Calculator.java. Instead of using integers,
 *      use rationals, as shown in Figure 13.10a. You will need to use the split method in
 *      the String class, introduced in Section 10.10.3, Replacing and Splitting Strings,
 *      to retrieve the numerator string and denominator string, and convert strings into
 *      integers using the Integer.parseInt method.
 *
 */

public class Chapter_13_E16_RationalCalculator {

	public static void main(String[] args) {
		
		if (args.length != 3 || !validInput(args)) {
			System.out.println("Wrong usage.");
			System.out.println("java ch13.Chapter_13_E16_RationalCalculator num/denom operator num/denom");
			System.exit(1);
		}
		
		System.out.println("Valid input is " + validInput(args));
		
		String inputString = "";
		
		for (String arg: args)
			inputString += arg + " ";
		
		inputString = inputString.replaceAll("\\s", "");
						
		String[] tokens = inputString.split("[+-./]");
		int[] nd = new int[tokens.length];
		
				
		for (int i = 0; i < tokens.length; i++)
			nd[i] = Integer.parseInt(tokens[i]);
		
		Rational r1 = new Rational(nd[0], nd[1]);
		Rational r2 = new Rational(nd[2], nd[3]);
		Rational result = new Rational();
		
		switch (args[1].charAt(0)) {
		
		case '+': result = r1.add(r2); break;
	  	
		case '-': result = r1.subtract(r2); break;
		
		case '.': result = r1.multiply(r2); break;
		
		case '/': result = r1.divide(r2); break;
		
		default: System.out.println("Invalid operator: use + - . /"); break;
		
		}
		
		System.out.println(r1 + " " + args[1] + " " + r2 + " = " + result);
		
	}
	
	public static boolean validInput(String[] args) {
		
		return (args[0].matches("[\\d]*[0-9]/[\\d]*[0-9]") &&
				args[1].matches("[+-./]") &&
				args[2].matches("[\\d]*[0-9]/[\\d]*[0-9]"));
	
	}

}
