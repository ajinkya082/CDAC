package io_programming;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class FlightDeserializationMain {

	public static void main(String[] args) {
		
		String filePath="./src/resources/flight.txt";
		try(
				FileInputStream fin=new FileInputStream(filePath);
				ObjectInputStream in =new ObjectInputStream(fin);
				){
			Object obj=in.readObject();
			System.out.println(obj);
			Flight fl=(Flight) obj;//Down Casting 
			System.out.println(fl.getAirline());
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
