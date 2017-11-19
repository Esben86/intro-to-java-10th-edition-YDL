package ch11;

public class Transaction {
	
	private java.util.Date date;
	private char type;
	private double amount;
	private double balance;
	private String description;
	
	public Transaction(char type, double amount, double balance, String description) {
		date = new java.util.Date();
		this.type = type;
		this.amount = amount;
		this.balance = balance;
		this.description = description;
	}
	
	@Override
	public String toString() {
		return "\nTransaction date: " + date + 
			   "\nType: " + type + 
			   "\nBalance: " + balance +
			   "\n" + description + "\n";
	}
	
}
