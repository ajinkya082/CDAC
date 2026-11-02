package io_programming;

import java.io.FileInputStream;
import java.io.IOException;
	
public class FileReadMain2 {
	public static void main(String[] args) {
		String filePath="./src/resources/greetings.txt"; 
		try(FileInputStream fin=new FileInputStream(filePath)) {
			
			while(true) {
				int charValue=fin.read();
				if(charValue==-1) {
					break;
				}
				char ch=(char) charValue;
				System.out.print(ch);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
