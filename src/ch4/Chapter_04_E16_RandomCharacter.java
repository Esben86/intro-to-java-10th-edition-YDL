package ch4;
import java.util.Scanner;

/**
 * Chapter 4 Exercise 16:
 *
 * (Random character)
 * Write a program that displays a random
 * uppercase letter using the Math.random() method.
 *
 */

public class Chapter_04_E16_RandomCharacter {

	public static void main(String[] args) {
		
		System.out.println((char)('a' + Math.random() * 26));
		
	}

}
