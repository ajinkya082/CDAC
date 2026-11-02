package io_programming;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class FileWriteMain {
	public static void main(String[] args) {
		String filePath = "./src/resources/cartoons.txt";
		String data = "\n4.Pink Panther\n5.Chin Chan";
		try(
				FileOutputStream fout = new FileOutputStream(filePath,true);//APPEND
				BufferedOutputStream bout = new BufferedOutputStream(fout)
			){
			byte [] getBytes = data.getBytes();
			bout.write(getBytes);
			System.out.println("Data is written in the file.");
		}
			catch(Exception ex) {
				ex.printStackTrace();
			}

	}
}
