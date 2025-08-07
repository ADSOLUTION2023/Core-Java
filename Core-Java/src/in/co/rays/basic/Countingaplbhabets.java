package in.co.rays.basic;

import java.util.Scanner;

public class Countingaplbhabets {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Type String :");
		String name = sc.next().toLowerCase();
		// String name = "indiana jones";
		System.out.println("String Name:" + name);
		int count = 0;
		for (char c = 'a'; c <= 'z'; c++) {
			for (int i = 0; i < name.length(); i++) {
				if (name.charAt(i) == c) {
					count++;
				}
			}
			if (count > 0) {
				System.out.print(c + "=" + count + ",");
				count = 0;
			}
		}
	}
}
