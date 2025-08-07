package in.co.rays.basic;

public class DecendingOrder {
	public static void main(String[] args) {
		int[] num1 = { 2, 4, 53, 6, 23, 45, 1234, 56, 89, 9, 90, 23 };
		System.out.println("The length of String :" + num1.length);
		int temp = 0;
		for (int i = 0; i < num1.length; i++) {
			for (int j = i + 1; j <num1.length; j++) {
				if (num1[j] > num1[i]) {
					temp = num1[i];
					num1[i] = num1[j];
					num1[j] = temp;
				}
			}
			System.out.print(num1[i] + " ,");
		}
		
	}

}
