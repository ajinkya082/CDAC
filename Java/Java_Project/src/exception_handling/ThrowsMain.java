package exception_handling;

public class ThrowsMain {
	
	private static void doTest() throws Exception{
		int ans=50/0;
	}
	private static void conductTest() {
		try {
			doTest();
		} catch (Exception e) {
			
		}
	}
	private static void performTest() throws Exception{
		doTest();
	}
	private static void handleTest() throws RuntimeException{
		
	}
	public static void main(String[] args) {
		//Invoke conductTest() and performTest();
		conductTest();
		try {
			performTest();
		}
		catch(Exception ex) {
			
		}
		handleTest();
	}
}


class base{
	void m1() throws Exception{
		
	}
}

class derived extends base{
	void m1() {//throws Exception also accpetable
		//acceptable
	}
}


//class base1{
//	void m1() {
//		
//	}
//}
//
//class derived1 extends base1{
//	void m1()throws Exception {
//		// not acceptable
//	}
//}













