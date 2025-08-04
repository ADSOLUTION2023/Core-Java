package in.co.rays.basic;

import java.util.Scanner;

public class CircleArea1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius of Circle:");
		int r = sc.nextInt();
		double PI = 3.14;
		double area = (PI * r * r);
		System.out.println("The area of circle:" + area + " " + "sq. units");
		sc.close();
	}	
}

