package ch10;

public class Chapter_10_E09_TestCourse {

	public static void main(String[] args) {
		
		Course course1 = new Course("Data Structures");
		
		course1.addStudent("John Smith");
		course1.addStudent("Lou Diamond Phillips");
		course1.addStudent("JP Walker");
		
		String[] students = course1.getStudents();
		
		System.out.println("Length of the students array: " + students.length);
		System.out.println("Number of students in the course: " + course1.getNumberOfStudents());
		System.out.println("Name of students in the course: ");
		course1.printStudents();
		
		course1.dropStudent("John Smith");
		
		System.out.println("\nAfter dropping a student....");
		
		students = course1.getStudents();
		
		System.out.println("Length of the students array: " + students.length);
		System.out.println("Number of students in the course: " + course1.getNumberOfStudents());
		System.out.println("Name of students in the course: ");
		course1.printStudents();

	}

}
