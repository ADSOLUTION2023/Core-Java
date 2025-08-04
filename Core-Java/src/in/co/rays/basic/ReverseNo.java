package in.co.rays.basic;

import java.util.Scanner;

public class ReverseNo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number:");
		int n = sc.nextInt();
		int temp = n;
		int r = 0;
		int num = 0;
		while (n > 0) {
			r = n % 10;
			num = (num * 10) + r;
			n = n / 10;
		}

		if (num == temp) {
			System.out.println("Its a Palindrom");
		} else if (num != n) {
			System.out.println("Its not a Palindrom");
			System.out.println("Reversed No. is :" + num);
		}
	}
}
