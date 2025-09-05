package com.rays.IO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteTextFile {
	public static void main(String[] args) throws Exception {
		
		FileWriter f = new FileWriter("D://Rays//Rays.txt");
		
		f.write("My Name is ram\nI am Learning Java\nI want to go to Indore");
		
		//System.out.println(f);
		
		System.out.println("Data written Successfully");
		
		f.close();
	}
}
