package com.rays.IO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteTextByBufferedWriter {
	public static void main(String[] args) {
		try {
			BufferedWriter w = new BufferedWriter(new FileWriter("D://Rays//Sita.txt"));
			w.write("My is Khan\nI am not a Terrorist\n");
			w.newLine();
			
		} catch (IOException e) {
			System.out.println("Exception:" + e.getMessage());
		}finally {
			System.out.println("Exception Handled");
		
		
		}
		
	}

}
