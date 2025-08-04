package in.co.rays.basic;

import java.util.Scanner;

public class HarmonicSeries {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("First term of Series:");
		System.out.println("Common difference is :");
		int a = sc.nextInt();
		int d = sc.nextInt();
		double harmonic = 0;
		double n = 0;
		for (int i = 1; i < 50; i++) {
			n = (a + (i - 1) * d);
			harmonic = 1 / n;
			// System.out.print(1 + "/" + n + " ");
			System.out.println(harmonic);
		}
		sc.close();
	}
}
