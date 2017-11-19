package ch13;

public class Course implements Cloneable {
	
	private String courseName;
	private String[] students = new String[0];
	private int numberOfStudents;
	
	public Course(String courseName) {
		this.courseName = courseName;
	}
	
	public void addStudent(String student) {
		if (numberOfStudents >= students.length) {
			String[] temp = new String[students.length + 1];
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
	
	public void clear() {
		this.numberOfStudents = 0;
		this.students = new String[0];
	}
	
	public void dropStudent(String student) {

		for (int i = 0; i < students.length; i++) {
			if (students[i].equalsIgnoreCase(student)) {
				students[i] = "";
				numberOfStudents--;
			}
		}
		
		for (int i = 0; i < students.length - 1; i++) {
			if (students[i].equals("")) {
				String temp = students[i];
				students[i] = students[i + 1];
				students[i + 1] = temp;
			}
		}
		
		String[] temp = new String[numberOfStudents];
		System.arraycopy(students, 0, temp, 0, numberOfStudents);
		students = temp;
	}
		
	@Override 
	public Object clone() throws CloneNotSupportedException {
		
		Course courseClone = (Course)super.clone();
		
		courseClone.students = (String[])(students.clone());
		
		return courseClone;
		
	}
		
}
