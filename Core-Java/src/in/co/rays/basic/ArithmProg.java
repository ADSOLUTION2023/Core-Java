package in.co.rays.basic;

import java.util.Scanner;

public class ArithmProg {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First term of AP:-");
		System.out.println("Enter common difference of AP:-");
		System.out.println("Enter No. of terms of AP:-");
		int a = sc.nextInt();
		int d = sc.nextInt();
		int n = sc.nextInt();
		int s = 0;

		int[] array = new int[n];

		int index = 0;
		for (int i = 1; i < n; i++) {
			s = a + (i - 1) * d;
			System.out.print(s + ",");
			array[index] = s;
			index++;
		}
		System.out.println();
		System.out.print("lenght of array = " + array.length + "\n");
		int temp = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] > array[i]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
			System.out.print(array[i] + ",");
		}
		sc.close();
	}
}
