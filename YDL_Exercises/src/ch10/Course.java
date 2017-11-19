package ch10;

public class Course {
	
	private String courseName;
	public String[] students = new String[1];
	private int numberOfStudents = 0;
	
	public Course(String courseName) {
		this.courseName = courseName;
	}
	
	public void addStudent(String student) {
		
		if (numberOfStudents == students.length) {
			
			String[] temp = new String[students.length * 2];
			System.arraycopy(students, 0, temp, 0, students.length);
			students = temp;
		}
		students[numberOfStudents++] = student;
	}
	
	public String[] getStudents() {
		return students;
	}
	
	public int getNumberOfStudents() {
		return numberOfStudents;
	}
	
	public String getCourseName() {
		return courseName;
	}
	
	public void dropStudent(String student) {
		
		int droppedStudentIndex = 0;
		boolean studentFound = false;
		
		for (int i = 0; i < numberOfStudents; i++) {
			if (this.students[i].equals(student)) {
				studentFound = true;
				droppedStudentIndex = i;
			}
		}
		
		/*
		 * If the array is full, expand the array so that the next
		 * step in the method does not reach IndexOutOfBounds
		 */
		if (numberOfStudents == students.length) {
			
			String[] temp = new String[students.length * 2];
			System.arraycopy(students, 0, temp, 0, students.length);
			students = temp;
		}
		
		if (studentFound) {
			for (int i = droppedStudentIndex; i < numberOfStudents; i++) {
				students[droppedStudentIndex] = students[++droppedStudentIndex];
			}
			numberOfStudents--;
		}
		
	}
	
	public void printStudents() {
		
		if (numberOfStudents == 0)
			System.out.println("Emtpy");
		else {
			for (int i = 0; i < numberOfStudents; i++)
				System.out.println("Name: " + students[i] + " Course: " + courseName);
		}
			
		
	}
	
	public void clear() {
		students = new String[1];
		numberOfStudents = 0;
	}

}
