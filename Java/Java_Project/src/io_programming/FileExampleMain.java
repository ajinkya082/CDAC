package io_programming;

import java.io.File;

public class FileExampleMain {
	public static void main(String[] args) {
		String path1="./src/resources";
		String path2="./src/resources/cartoons.txt";
		String path3="./src/assets";
	
		
		File f1=new File(path1);
		File f2=new File(path2);
		File f3=new File(path3);
		
		System.out.println(f1.exists());
		System.out.println(f2.exists());
		System.out.println(f3.exists());
		
		System.out.println("==============================================");
		
		System.out.println(f1.isFile());
		System.out.println(f2.isFile());
		
		System.out.println("==============================================");
		
		System.out.println(f1.isDirectory());
		System.out.println(f2.isDirectory());
		
		if(!f3.exists()) {
			f3.mkdir();
		}
		else {
			System.out.println("Directory already exists");
		}
	}
}
