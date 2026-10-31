package exception_handling;

public class UserDefinedExceptionMain {
	public static void main(String[] args) {
		try {
			int position =NameCollection.getPosition("Ramushonat");
			System.out.println(position);
		} catch (NameNotFoundException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}
