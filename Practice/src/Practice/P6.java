package Practice;

import java.util.Scanner;

public class P6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No. of terms :");
		int n = sc.nextInt();
		System.out.println("Enter first term of series:");
		int a = sc.nextInt();
		int fib = 0;
		for (int i = 1; i <= n; i++) {
			fib = a+a;
		System.out.println(fib);
		}
	sc.close();	
	}
}
