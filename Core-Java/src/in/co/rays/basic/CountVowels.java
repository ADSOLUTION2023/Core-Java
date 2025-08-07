package in.co.rays.basic;

public class CountVowels {
	public static void main(String[] args) {
		String str = "amit Chandsarkar";
		int count = 0;
		System.out.println("String Length:" + str.length() );
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
				count++;
			}
		}
		System.out.println("The No. of Vowels :" + count);
	}
}
