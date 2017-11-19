package ch4;

/**
 * Chapter 4 Exercise 25:
 *
 * (Generate vehicle plate numbers)
 * Assume a vehicle plate number consists of three uppercase
 * letters followed by four digits. Write a program to
 * generate a plate number.
 *
 */

public class Chapter_04_E25_VeichlePlateNumber {

	public static void main(String[] args) {
		
		char ch1 = (char) (Math.random() * 26 + 65);
		char ch2 = (char) (Math.random() * 26 + 65);
		char ch3 = (char) (Math.random() * 26 + 65);
		char dig1 = (char) (Math.random() * 9 + 48);
		char dig2 = (char) (Math.random() * 9 + 48);
		char dig3 = (char) (Math.random() * 9 + 48);
		char dig4 = (char) (Math.random() * 9 + 48);
		
		System.out.println(ch1 + "" + ch2 + "" + ch3 + "" + dig1 + "" + dig2 + dig3 + "" + dig4);

	}

}
