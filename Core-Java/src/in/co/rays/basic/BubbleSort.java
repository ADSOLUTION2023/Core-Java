package in.co.rays.basic;

public class BubbleSort {
	public static void main(String[] args) {
		int[] num = { 23, 4, 56, 3, 7, 8, 90, 12, 34 };
		System.out.println("The length of String :" + num.length);
		int temp = 0;
		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[j] > num[i]) {
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
			System.out.print(num[i] + " ");
		}
	}

}
