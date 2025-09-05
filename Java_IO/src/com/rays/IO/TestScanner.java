package com.rays.IO;

import java.util.Scanner;

public class TestScanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Type your age");

		int i = sc.nextInt();

		System.out.println("Age = " + i);

		System.out.println("Type you name");

		String str = sc.next();

		System.out.println("Name = " + str);
		sc.close();
	}

}
