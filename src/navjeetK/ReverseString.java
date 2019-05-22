package navjeetK;

public class ReverseString {

	static void reverseString1(String str) {
		String[] str1 = str.split(" ");

		String str3 = "";

		for (int i = 0; i < str1.length; i++) {

			String str2 = "";
			for (int j = str1[i].length() - 1; j >= 0; j--) {

				str2 = str2 + str1[i].charAt(j);

			}

			str3 = str3 + " " + str2;

		}

		System.out.println(str3);

	}

	public static void main(String[] args) {
		String str = "there is an apple";

		reverseString1(str);

	}

}
