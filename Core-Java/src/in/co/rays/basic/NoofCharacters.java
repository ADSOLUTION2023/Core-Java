package in.co.rays.basic;

import java.util.Scanner;

public class NoofCharacters {
	public static void main(String[] args) {
			char[] alphas = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's',
				't', 'u', 'v', 'w', 'x', 'y', 'z' };
		String name = "amit chandsarkar";
		int count = 0;
		System.out.println("The Length of string:" + name.length());
		for (char alpha : alphas) {
			for (int i = 0; i < name.toLowerCase().length(); i++) {
				if (name.charAt(i) == alpha) {
					count++;
				}
			}
			if (count > 0) {
				System.out.print(alpha + " = " + count + " ,");
				count = 0;
			}
		}

	}

}
