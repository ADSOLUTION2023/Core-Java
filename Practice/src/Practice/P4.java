package Practice;

import java.util.Scanner;

public class P4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter number:");
		int f = sc.nextInt();
		int fac = f;
		for (int i = 1; i < f; i++) {
			fac = fac * (f-i);
		}
		System.out.println("Factorial:" + " " + fac);
	sc.close();
	}
}
