package in.co.rays.basic;

import java.util.Scanner;

public class TestArrays {

	public static void main(String[] args) {
		Scanner sac = new Scanner(System.in);
		System.out.println("Enter number:");
		int n = sac.nextInt();
		int[] a = { 2, 3, 4, 6, 123, 45, 67, 78 };
		int position = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == n) {
				position = i;
				System.out.println("The index position is :" + position +" \n"+ "The no. is :"+ a[i]);
			}
		}
		sac.close();
	}
}