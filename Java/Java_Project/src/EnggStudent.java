
public class EnggStudent {
	private int studentId;
	private String name;
	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	private String branch; 
	
	//assigning the values
	public void assignValues(int id,String nm,String br) {
		studentId=id;
		name=nm;
		branch=br;
	}
	
	//printing vlaues
	public void printValues() {
		System.out.println(studentId);
		System.out.println(name);
		System.out.println(branch);
	}
}
