package io_programming;

import java.io.FileInputStream;
import java.io.IOException;

public class FileReadMain {
	public static void main(String[] args) {
		String filePath="./src/resources/greetings.txt"; 
		FileInputStream fin=null;
		try {
			fin=new FileInputStream(filePath);
			while(true) {
				int charValue=fin.read();
				if(charValue==-1) {
					break;
				}
				char ch=(char) charValue;
				System.out.print(ch);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fin.close();
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}
}
