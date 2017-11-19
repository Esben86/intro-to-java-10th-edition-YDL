package ch11;

import java.util.Date;

public class Faculty extends Employee {
	
	private String officeHours;
	private String rank;
	
	public Faculty() {
	}
	
	public Faculty(String name) {
		super(name);
	}
	
	public Faculty(String name, MyDate dateHired, String officeHours, String rank) {
		super(name, dateHired);
		this.officeHours = officeHours;
		this.rank = rank;	
	}
	
	public String getOfficeHours() {
		return officeHours;
	}
	
	public void setOfficeHours(String officeHours) {
		this.officeHours = officeHours;
	}
	
	public String getRank() {
		return rank;
	}
	
	public void setRank(String rank) {
		this.rank = rank;
	}
	
	@Override
	public String toString() {
		 return super.toString() +
				 "\nDate hired: " + getDateHired().toString() +
				 "\nOffice hours: " + officeHours +
				 "\nRank: " + rank;
	 }


}
