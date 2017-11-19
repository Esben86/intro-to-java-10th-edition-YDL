package ch11;
import java.util.Date;

public class Chapter_11_E02_TestClasses {

	public static void main(String[] args) {
		
		Person person1 = new Person("Esben Munck");
		System.out.println(person1.toString());
		
		System.out.println();
						
		Student student1 = new Student("Steven Gerrard", Student.FRESHMAN);
		System.out.println(student1.toString());
		
		System.out.println();
			
		Employee emp1 = new Employee("Stian Stribolt", "Tverrmyra", 500000, new MyDate());
		emp1.setAddress("Solstien 9b");
		emp1.setPhoneNumber("95070011");
		emp1.setEmailAddress("post@vbr.no");
		System.out.println(emp1.toString());
		
		System.out.println();
		
		Faculty fac1 = new Faculty("Kid Rock", new MyDate(), "0800-1600", "Dean");
		fac1.setAddress("Romeo, Michigan");
		fac1.setPhoneNumber("1998-K-I-D");
		fac1.setEmailAddress("Grock@gmail.com");
		fac1.setOffice("Home");
		fac1.setSalary(1500000);
		System.out.println(fac1.toString());
		
		System.out.println();
		
		Staff staff1 = new Staff("Roald Jensen", new MyDate(), "Janitor");
		staff1.setAddress("Ringshaug Skole");
		staff1.setPhoneNumber("33320000");
		staff1.setEmailAddress("roald@gmail.com");
		staff1.setOffice(null);
		staff1.setSalary(150000);
		System.out.println(staff1.toString());
		
		
		
	}

}
