package ch5;

/**
 * Chapter 5 Exercise 11:
 *
 * (Find numbers divisible by 3 or 4, but not both)
 * 
 * Write a program that displays all the numbers from 100 to 1000,
 * ten per line, that are divisible by 3 or 4,
 * but not both. Numbers are separated by exactly one space.
 *
 */

public class Chapter_05_E11_DivBy4Or4ButNotBoth {

	public static void main(String[] args) {
		
		int lineCounter = 1;
		
		for (int i = 100; i <= 1000; i++) {
			
			if (i % 3 == 0 ^ i % 4 == 0) {
				System.out.print((lineCounter++ % 10 != 0) ? i + " " : i + "\n");	
			}	
		}
	}

}
