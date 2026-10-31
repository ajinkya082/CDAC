package exception_handling;

public class ThrowMain {
	private static int divide(int x,int y) {
		if(y==0) {
			RuntimeException rx=new RuntimeException("Second value can't be zero");
			throw rx;
		}
		return x/y;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println(divide(50, 0));
		}
		catch(RuntimeException ex) {
			String msg=ex.getMessage();
			System.out.println(msg);
		}
	}

}
