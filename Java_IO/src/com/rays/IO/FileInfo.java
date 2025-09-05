package com.rays.IO;

import java.io.File;
import java.util.Date;

public class FileInfo {
	public static void main(String[] args) {
		
		File f= new File("D:\\Rays");
		if (f.exists()) {
			System.out.println("File Name :" + f.getName());
			System.out.println("Absolute Path:" + f.getAbsolutePath());
			System.out.println("Can Write:" + f.canWrite());
			System.out.println("Can Read : " + f.canRead());
			System.out.println("Is this a File :" + f.isFile());
			System.out.println("Is this is folder:" + f.isDirectory());
			Date d = new Date(f.lastModified());
			System.out.println("Last Modified:" + d);
			System.out.println("Size of File:" + f.length());
		}else {
			System.out.println("File not Found");
			
		}
	}

}
