package ch7;
import java.util.Scanner;
import java.util.Arrays;

public class Chapter_07_E34_SortCharacters {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String inputString = input.next();
		
		System.out.println(sort(inputString));

	}
	
	public static String sort(String inputString) {
		
		char[] chars = new char[inputString.length()];
		String outputString = "";
		
		for (int i = 0; i < chars.length; i++) {
			chars[i] = inputString.charAt(i);
		}
		
		selectionSort(chars);
		
		for (int i = 0; i < chars.length; i++) {
			outputString += chars[i];
		}
			
		return outputString;
		
	}
	
	public static char[] selectionSort(char[] chars) {
		
		for (int i = 0; i < chars.length; i++) {
			
			int currentMinIndex = i;
			char currentMin = chars[i];
			
			for (int j = i + 1; j < chars.length; j++) {
				
				if(chars[j] < currentMin) {
					currentMinIndex = j;
					currentMin = chars[j];	
				}
			}
			
			if (currentMinIndex != i) {
				chars[currentMinIndex] = chars[i];
				chars[i] = currentMin;
			}
		}
		return chars;
	}

}
