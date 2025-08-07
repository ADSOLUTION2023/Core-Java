package in.co.rays.basic;

public class CountIntFromString {
	public static void main(String[] args) {
		String str = "Amit Chandsarkar 1986";
		int count = 0;
		System.out.println("Length of String:" + str.length());
		for (int i = 0; i < str.length(); i++) {
			System.out.print(str.charAt(i));
			if (Character.isDigit(str.charAt(i))) {
				count++;
			}
		}	
		System.out.println("No. of integers is :" + count);
		count = 0;
		for (int j = 0; j < str.length(); j++) {
			//zSystem.out.print(str.charAt(j));
			if (Character.isAlphabetic(str.charAt(j))) {
				count++;
			}
		}
		System.out.println("\nNo. of Alphabets is :" + count);
	}

}
