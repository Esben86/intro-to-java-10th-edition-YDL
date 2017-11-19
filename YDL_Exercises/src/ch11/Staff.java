package ch11;
import java.util.Date;

public class Staff extends Employee {
	
private String title;
    
    public Staff() {
    	
    }
    
    public Staff(String name) {
    	super(name);
    }
    
    public Staff(String name, MyDate dateHired) {
    	super(name, dateHired);
    }
    
    public Staff(String name, MyDate dateHired, String title) {
    	super(name, dateHired);
    	this.title = title;
    }
    
    public String getTitle() {
    	return title;
    }
    
    public void setTitle(String title) {
    	this.title = title;
    }
    
    @Override
	public String toString() {
		 return super.toString() +
				 "\nTitle: " + title;
	 }

}
