package in.co.rays.basic;

import java.util.*;

public class Age {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age:");
		int a = sc.nextInt();
		if (a > 18) {
			System.out.println("User is Adult");
		} else if (a > 5 && a < 10) {
			System.out.println("User is in Adolecence");
		} else if (a > 10 && a < 18) {
			System.out.println("User is Teenager");
		} else {
			System.out.println("User is Minor");
		}

	}

}
