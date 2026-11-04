package java8;
@FunctionalInterface
interface Greet{
	void doGreet();
}

interface Greeting{
	void sayGreeting(String user);
}

interface Operator{
	int doOperate(int x,int y);
}




public class LambdaExpressionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Greet gr=()-> System.out.println("Happy Diwali");
		gr.doGreet();
		System.out.println("=====================================");
		Greeting grn=(String nm)->System.out.println("Happy Diwali "+nm);
		grn.sayGreeting("King");
		Greeting grn2=(nm)->System.out.println("Happy Diwali "+nm);
		grn2.sayGreeting("Kong");
		System.out.println("=====================================");
		Operator adder=(n1,n2)-> n1+n2;
		int addition=adder.doOperate(10, 5);
		System.out.println(addition);
		Operator subtractor=(n1,n2)->{
			int subtraction=n1-n2;
			return subtraction;
		};
		int subtraction=subtractor.doOperate(40, 30);
		System.out.println(subtraction);
		System.out.println("=====================================");
		
		Runnable rn=()->System.out.println("Thank you visit again.");
		Thread t1=new Thread(rn);
		t1.start();
	} 

}
