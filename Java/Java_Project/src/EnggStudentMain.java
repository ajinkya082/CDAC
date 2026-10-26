
public class EnggStudentMain {
	public static void main(String[] args) {
		EnggStudent st=new EnggStudent();
		
		st.assignValues(20, "Pritam", "CS");
		st.printValues();
		System.out.println("------------------------");
		st.setBranch("IT");
		st.printValues();
		System.out.println("------------------------");
		String sname=st.getName();
		System.out.println(sname);
		System.out.println(st.getName());
	}
}
