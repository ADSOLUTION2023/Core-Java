package com.rays.IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyValidEmail {
	public static void main(String[] args) throws Exception {
		try {
			BufferedReader oldEmail = new BufferedReader(new FileReader("D://Rays//Email.txt"));
			BufferedWriter newEmail = new BufferedWriter(new FileWriter("D://Rays//Email.txt",true));
			
			String email = oldEmail.readLine();
			
			while(email!=null) {
				if(email.endsWith("@gmail.com")) {
					System.out.println("Valid Email :" + email);
					newEmail.write(email);
					newEmail.newLine();
				}
					email = oldEmail.readLine();
				}
			System.out.println("Valid Email Copied Successfully");
			oldEmail.close();
			newEmail.close();
			} catch (FileNotFoundException e) {
			 System.out.println("Exception:" + e.getMessage());
		}
		
}

}
