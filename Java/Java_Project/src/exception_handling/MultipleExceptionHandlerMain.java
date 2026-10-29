package exception_handling;

public class MultipleExceptionHandlerMain {

	public static void main(String[] args) {
		// Program that accept 2 no. as cmd line arguments and print their sum
		try {
			int x=Integer.parseInt(args[0]);
			int y=Integer.parseInt(args[1]);
			int result=x/y;
			System.out.println(result);

		}
		catch(ArrayIndexOutOfBoundsException  |ArithmeticException e) {
			if(e instanceof ArrayIndexOutOfBoundsException) {
				System.out.println("Enter atleast 2 numbers");
			}
			else
			{
				System.out.println("Enter 2nd value as non-zero");
			}
		}
//		catch(ArrayIndexOutOfBoundsException e)
//		{
//			System.out.println("Enter atleast 2 numbers");
//		}
//		catch(ArithmeticException e) //version 7 introduse it
//		{
//			System.out.println("Enter 2nd value as non-zero");
//		}
		
	}
}