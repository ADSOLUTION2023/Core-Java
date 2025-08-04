package in.co.rays.basic;

public class Program7 {
	public static void main(String[] args) {
		// int a = 0;
		int sum = 0;
		for (int i = 100; i < 201; i++) {
			if (i % 7 == 0) {
				sum = sum + i;
				System.out.print(i + " ");
			}
		}

		System.out.println("\n" + "The Sum of numbers divisible by 7 between 100 to 200 is:" + sum);

	}
}
