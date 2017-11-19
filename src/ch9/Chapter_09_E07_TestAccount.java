package ch9;

import javax.jws.soap.SOAPBinding;

public class Chapter_09_E07_TestAccount {

	public static void main(String[] args) {
		
		Account acc1 = new Account(1122, 20000);
		
		acc1.setAnnualInterestRate(4.5);
		acc1.withdraw(2500);
		acc1.deposit(3000);
		
		System.out.println("The current balance is: " + acc1.getBalance());
		System.out.println("The monthly interest is: " + acc1.getMonthlyInterest());
		System.out.println("The account was created on the " + acc1.getDateCreated());

	}

}
