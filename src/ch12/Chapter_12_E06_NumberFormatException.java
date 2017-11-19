package ch12;

public class Chapter_12_E06_NumberFormatException {

	public static void main(String[] args) {
		
		String hexString1 = "FEA8";
		String hexString2 = "QWERTY";
		
		try {
			System.out.println("The decimalvalue of hex string " + hexString1 + " is " + hexToDecimal(hexString1));
			System.out.println("The decimalvalue of hex string " + hexString2 + " is " + hexToDecimal(hexString2));
		}
		catch (NumberFormatException ex) {
			System.out.println(ex.getMessage());
		}
	}
	
	public static int hexToDecimal(String hex) 
			throws NumberFormatException {
		
		if (hex.matches("[0-9a-fA-F]+")) {
			
			int decimalValue = 0;
			
			for (int i = 0; i < hex.length(); i++) {
				char hexChar = hex.charAt(i);
				decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
			}
			return decimalValue;
			
		} else throw new NumberFormatException(hex + " is not a hex string");
	}
	
	public static int hexCharToDecimal(char ch) {
		if (ch >= 'A' && ch <= 'F')
			return 10 + ch - 'A';
		else
			return ch - '0';
	}

}
