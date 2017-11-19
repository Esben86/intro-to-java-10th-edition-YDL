package ch11;
import java.util.Date;

public class Employee extends Person {
	
	protected String office;
	protected double salary;
	protected MyDate dateHired;
	
public Employee() {
		
	}
	
	public Employee(String name) {
		super(name);
	}
	
	public Employee(String name, MyDate dateHired) {
		super(name);
		this.dateHired = dateHired;
	}
	
	public Employee(String name, String office, double salary, MyDate dateHired) {
		super(name);
		this.office = office;
		this.salary = salary;
		this.dateHired = dateHired;
		
	}
	
	public String getOffice() {
		return office;
	}
	
	public void setOffice(String office) {
		this.office = office;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public MyDate getDateHired() {
		return dateHired;
	}
	
	@Override
	 public String toString() {
		 return super.toString() +
				 "\nOffice: " + office +
				 "\nSalary: " + salary +
				 "\nDate hired: " + dateHired.toString();
	 }

}
