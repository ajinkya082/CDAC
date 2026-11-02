package io_programming;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
	
public class FileReadMain3 {
	public static void main(String[] args) {
		String filePath="./src/resources/greetings.txt"; 
		try(FileInputStream fin=new FileInputStream(filePath);
				BufferedInputStream bin=new BufferedInputStream(fin)) {
			
			while(true) {
				int charValue=bin.read();
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
