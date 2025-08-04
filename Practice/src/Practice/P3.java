package Practice;

import java.util.Scanner;

public class P3 {
	// public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int rand = sc.nextInt(100);
//		for (int i = 0; i < 5; i++) {
//			System.out.println(rand + 1);
//		}
//		sc.close();
import java.util.Random;

Random rand = new Random();

	for(int i = 0;i<5;i++){
		System.out.println(rand.nextInt(100) + 1);
	}
}

