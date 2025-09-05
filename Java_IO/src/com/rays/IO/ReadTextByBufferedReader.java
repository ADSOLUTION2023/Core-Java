package com.rays.IO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadTextByBufferedReader {
	public static void main(String[] args) throws IOException {
		BufferedReader file = new BufferedReader(new FileReader("D://Rays//Hello.txt"));
		String line = file.readLine();
		while (line!=null) {
			System.out.println(line);
			line = file.readLine();
		}
		file.close();
	}

}
