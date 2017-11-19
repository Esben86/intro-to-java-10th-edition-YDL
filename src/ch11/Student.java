package ch11;

public class Student extends Person {
	
	public static final String FRESHMAN = "Freshman";
	public static final String SOPHOMORE = "Sophomore";
	public static final String JUNIOR = "Junior";
	public static final String SENIOR = "Senior";
	
	private String status;
	
	public Student() {
		
	}
	
	public Student(String name, String status) {
		super(name);
		this.status = status;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public String toString() {
		return super.toString() +
				"\nStatus: " + status;
	}
	
}
