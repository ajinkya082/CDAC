package Practise;

public class MyExceptionMain {

	public static void main(String[] args) {
		MyExceptionExample me=new MyExceptionExample();
		
		try {
			int pos=me.getPosition("Mans");
			System.out.println(pos);
		} catch (MyException e) {
			
			System.out.println(e.getMessage());
		}

	}

}
