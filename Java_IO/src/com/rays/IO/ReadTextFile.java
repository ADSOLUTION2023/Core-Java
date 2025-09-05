package com.rays.IO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadTextFile {
	public static void main(String[] args){
		FileReader f = null;
		
		try {
			f = new FileReader("D://Rays//Hello.txt");
			int i = f.read();
			while(i!=-1) {//because of ASCII value
				System.out.print((char)i);
				i=f.read();
			}
			}catch (Exception e) {
				System.out.println("Exception:" + e.getMessage());
			}finally {
				try {
					f.close();
				} catch (IOException e) {
					System.out.println("Exception:" + e.getMessage());
				}
			}
	
}
}
