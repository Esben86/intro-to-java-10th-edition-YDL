package ch13;

/**
 * Chapter 13 Exercise 13:
 *
 *      (Enable the Course class cloneable)
 *      Rewrite the Course class in Listing 10.6
 *      to add a clone method to perform a deep copy on the students field.
 *
 */

public class Chapter_13_E13_CourseClone {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Course c1 = new Course("Math");
		
		c1.addStudent("JP Walker");
		c1.addStudent("Lucas Magoon");
		c1.addStudent("Deadlung");
		
		Course c2 = (Course)c1.clone();
		
		System.out.println("Number of students in each course: ");
		System.out.println("C1: " + c1.getNumberOfStudents());
		System.out.println("C2: " + c2.getNumberOfStudents());
		
		String[] c1Students = c1.getStudents();
		String[] c2Students = c2.getStudents();
		
		System.out.println("\nList of students in c1: ");
		for (String student: c1Students)
			System.out.println(student);
		
		System.out.println("\nList of students in c2: ");
		for (String student: c2Students)
			System.out.println(student);
		
		c2.addStudent("Nate Bozung");
		c1.dropStudent("Deadlung");
		
		c1Students = c1.getStudents();
		c2Students = c2.getStudents();
		
		System.out.println("Number of students in each course after adding and dropping: ");
		System.out.println("C1: " + c1.getNumberOfStudents());
		System.out.println("C2: " + c2.getNumberOfStudents());
		
		System.out.println("\nList of students in c1 after adding and dropping: ");
		for (String student: c1Students)
			System.out.println(student);
		
		System.out.println("\nList of students in c2 after adding and dropping: ");
		for (String student: c2Students)
			System.out.println(student);

	}

}
