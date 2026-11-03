package collection_framework;

import java.util.Stack;

public class StackOperationsMain {

	public static void main(String[] args) {
		Stack dataValues=new Stack();
		dataValues.push("Mongo");
		dataValues.push("Gauva");
		dataValues.push("Chiku");
		System.out.println("-------");
		for(Object obj:dataValues) {
			System.out.println("|"+obj+"|");
			System.out.println("-------");
		}
		System.out.println("============================");
		Object poppedObj=dataValues.pop();
		System.out.println("poped Object is : " + poppedObj );
		for(Object obj:dataValues) {
			System.out.println(obj);
		}
		System.out.println("============================");
		Object peekObj=dataValues.peek();
		System.out.println("peek Object is : " + peekObj );
		for(Object obj:dataValues) {
			System.out.println(obj);
		}
	}

}
