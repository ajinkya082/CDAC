package Assignment;

public class StudentMain {
	public static void main(String[] args) {
		Student s1=new Student();
		Student s2=new Student();
		Student s3=new Student();
		
		s1.setStudentId(101);
		s1.setStudentName("India");
		s1.setMarks(95);
		s1.display();
//		s1.calculateGrade();
		System.out.println("===============================================");
		
		s2.setStudentId(102);
		s2.setStudentName("Aussie");
		s2.setMarks(60);
		s2.display();
//		s2.calculateGrade();
		System.out.println("===============================================");
		
		s3.setStudentId(103);
		s3.setStudentName("Russi");
		s3.setMarks(85);
		s3.display();
//		s3.calculateGrade();
		System.out.println("===============================================");
	}
}
