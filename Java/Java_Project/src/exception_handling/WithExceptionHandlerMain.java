package exception_handling;

public class WithExceptionHandlerMain {

	public static void main(String[] args) {
		// Program that accept 2 no. as cmd line arguments and print their sum
		try {
			int x=Integer.parseInt(args[0]);
			int y=Integer.parseInt(args[1]);
			int result=x+y;
			System.out.println(result);

		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Enter atleast 2 numbers");
		}
		

	}

}
