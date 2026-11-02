package Assignment;

public class Student {
	private int studentId;
	private String studentName;
	private int marks;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	public void display() {
		System.out.println("Student Id : " + studentId);
		System.out.println("Student Name : " + studentName);
		System.out.println("Student marks : " + marks);
		System.out.println("Grade : "+ calculateGrade());
	}
	public char calculateGrade() {
		if(marks>=90) {
			return 'A';
		}
		else if(marks<90 && marks>=75) {
			return 'B';
		}
		else if(marks<75 && marks>=60) {
			return 'C';
		}	
		return 'D';
	}
	
}
