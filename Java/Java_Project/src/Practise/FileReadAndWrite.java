package Practise;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileReadAndWrite {
	public static void main(String[] args) {
		//Read
		//		String filepath="./src/resources/cartoons.txt";
		//		try(FileInputStream fin=new FileInputStream(filepath);
		//				BufferedInputStream bin=new BufferedInputStream(fin)){
		//			while(true) {
		//				int charValue=bin.read();
		//				if(charValue==-1) {
		//					break;
		//				}
		//				char ch=(char)charValue;
		//				System.out.print(ch);
		//			}
		//		}
		//		catch(Exception ne) {
		//			ne.printStackTrace();
		//		}

		//WRITE
		String  filePath="./src/resources/fun.txt";
		String data="\n1.Happy Diwali \n2.Ramoji filmcity";
		try(FileOutputStream fout=new FileOutputStream(filePath);
				BufferedOutputStream bout=new BufferedOutputStream(fout)){
			byte[] getBytes=data.getBytes();
			bout.write(getBytes);
			System.out.println("Data is written in the file");
		}
		catch(Exception fn) {
			fn.printStackTrace();
		}
	}
}
