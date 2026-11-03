package io_programming;

import java.io.InputStream;
import java.util.Scanner;

public class AcceptInputMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStream keyboard=System.in;
		try(
				Scanner sc=new Scanner(keyboard);
				){
			System.out.println("Enter your name: ");
			String myName=sc.nextLine();
			System.out.println("Enter your height (cm): ");
			int myHeight=sc.nextInt();
			System.out.println("Enter your weight (kg): ");
			float myWeight=sc.nextFloat();
			
			float heightInMtr=myHeight/100.0f;
			float bmi=myWeight/(heightInMtr*heightInMtr);
			System.out.print("Hey "+myName + " , your BMI is : " + bmi);
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
