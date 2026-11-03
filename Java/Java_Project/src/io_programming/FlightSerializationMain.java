package io_programming;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class FlightSerializationMain {

	public static void main(String[] args) {
		String filePath="./src/resources/flight.txt";
		try(
				FileOutputStream fout=new FileOutputStream(filePath);
				ObjectOutputStream out=new ObjectOutputStream(fout);
				){
			Flight flt=new Flight("ANA45","All Nippon Airways","Mumbai","Tokyo");
			out.writeObject(flt);
			System.out.println("Flight Object serialized successfully.");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
