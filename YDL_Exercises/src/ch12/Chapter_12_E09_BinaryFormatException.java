package ch12;

public class Chapter_12_E09_BinaryFormatException {

	public static void main(String[] args) {
		
		String binaryString1 = "111010011";
		String binaryString2 = "1013";
		
		try {
			System.out.println("The decimal value of binary string " + binaryString1 + " is " + bin2Dec(binaryString1));
			System.out.println("The decimal value of binary string " + binaryString2 + " is " + bin2Dec(binaryString2));
		}
		catch (BinaryFormatException ex) {
			System.out.println(ex.getMessage());
		}

	}
	
	public static int bin2Dec(String binaryString) 
			throws BinaryFormatException {
		
		if (binaryString.matches("(0|1)+")) {
			
			int decimalValue = 0;
			int powCounter = 0;
			
			for (int i = binaryString.length() - 1; i >= 0; i--) {
				
				if ((int) binaryString.charAt(i) - 48 == 1)
					decimalValue += (int) Math.pow(2, powCounter);
				
				powCounter++;
			}
			return decimalValue;
			
		} else throw new BinaryFormatException(binaryString + " is not a binary string");
	}

}
