package in.co.rays.basic;

import java.util.Scanner;

public class CircleArea {
	public static void main(String[] args) {
		// double PI = 3.14;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your name :");
		String name = sc.nextLine();
		System.out.print("Enter your age :");
		int age = sc.nextInt();
		System.out.print("Hello" + name + "Your age :" + age);

		sc.close();
	}
}