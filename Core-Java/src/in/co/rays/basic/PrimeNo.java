package in.co.rays.basic;

import java.util.Scanner;

public class PrimeNo {
	private static Scanner var;

	public static void main(String[] args) {
		var = new Scanner(System.in);
		System.out.println("Enter Number:");
		int n = var.nextInt();
		int count = 0;
		
		if(n == 0 || n == 1) {
			System.out.println("Its not a Prime No.:" + n);
			return;
		}
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		if (count > 0) {
			System.out.println("Its not a Prime No. :" + n);
		} else {
			System.out.println("Its a Prime No.:" + n);
		}

	}
}
