package ch12;

public class Chapter_12_E08_HexFormatException {

	public static void main(String[] args) {
		
		String hexString1 = "FEA8";
		String hexString2 = "QWERTY";
		
		try {
			System.out.println("The decimalvalue of hex string " + hexString1 + " is " + hexToDecimal(hexString1.toUpperCase()));
			System.out.println("The decimalvalue of hex string " + hexString2 + " is " + hexToDecimal(hexString2.toUpperCase()));
		}
		catch (HexFormatException ex) {
			System.out.println(ex.getMessage());
		}

	}
	
	public static int hexToDecimal(String hex) 
			throws HexFormatException {
		
		if (hex.matches("[0-9A-F]+")) {
			
			int decimalValue = 0;
			
			for (int i = 0; i < hex.length(); i++) {
				char hexChar = hex.charAt(i);
				decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
			}
			return decimalValue;
			
		} else throw new HexFormatException(hex + " is not a hex string");
	}
	
	public static int hexCharToDecimal(char ch) {
		if (ch >= 'A' && ch <= 'F')
			return 10 + ch - 'A';
		else
			return ch - '0';
	}

}
