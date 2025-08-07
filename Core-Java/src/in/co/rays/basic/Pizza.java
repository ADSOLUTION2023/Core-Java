package in.co.rays.basic;

import java.util.Scanner;

public class Pizza {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int money = sc.nextInt();
		if (money>100) {
			System.out.println("I can buy Pizza:)");
		} else {
			System.out.println("I can't buy Pizza:(");
		}
	    sc.close();
	}
}
