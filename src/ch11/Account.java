package ch11;
import java.util.Date;
import java.util.ArrayList;

public class Account {
	
	private String name;
	private int id = 0;
	protected double balance = 0;
	private double annualInterestRate = 0;
	private String dateCreated;
	private ArrayList<Transaction> transactions;
	
	public Account(){
		dateCreated = new Date().toString();
		transactions = new ArrayList<>();
	}
	
	public Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
		dateCreated = new Date().toString();
		transactions = new ArrayList<>();
	}
	
	public Account(String name, int id, double balance) {
		this.name = name;
		this.id = id;
		this.balance = balance;
		dateCreated = new Date().toString();
		transactions = new ArrayList<>();
	}
	
	public int getId() {
		return id;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	
	public String getDateCreated() {
		return dateCreated;
	}
	
	public double getMonthlyInterestRate() {
		return annualInterestRate / 12;
	}
	
	public double getMonthlyInterest() {
		return balance * getMonthlyInterestRate();
	}
	
	public void withdraw(double amount) {
		transactions.add(new Transaction('W', amount, balance, "withdraw"));
		this.balance -= amount;
	}
	
	public void deposit(double amount) {
		transactions.add(new Transaction('D', amount, balance, "deposit"));
		this.balance += amount;
	}
	
	@Override
	public String toString() {
		return 	"Name " + name +
				"\nID " + id +
				"\nBalance " + balance +
				"\nDate created " + dateCreated +
				"\nAnnual interest rate " + annualInterestRate + " %" + 
				"\nTransactions:\n" + transactions;
	}
}
