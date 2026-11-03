package collection_framework;

import java.util.Stack;

import io_programming.Flight;

public class StackExampleMain {

	public static void main(String[] args) {
		Stack dataValues=new Stack();
		dataValues.add("Welcome to Collections");
		dataValues.add("Collections are evrywhere");
		dataValues.add(new StringBuilder("Welcome"));
		dataValues.add(new Flight("LA484","Air India","Mumbai","Los Angeles"));
		int score=57;
		dataValues.add(score);//dataValues.add(new Integer(score));=>Autoboxing
		System.out.println(dataValues);
		System.out.println("Element at 3rd index: "+ dataValues.get(3));
		System.out.println("==================Printing all values===================");
		int size=dataValues.size();
		System.out.println("Size is " + size);
		for(int i=0;i<size;i++) {
			Object obj=dataValues.get(i);
			System.out.println(obj);
			
		}
		
		System.out.println("==================Printing all values again===================");
		for(Object obj:dataValues) {
			System.out.println(obj);
		}
	}
}
