package navjeetK;

public class StringReverse {

	static void reverseString(String str) {
		String[] str1 = str.split(" ");

		String str3 = "";

		for (int i = str1.length - 1; i >= 0; i--) {

			String str2 = "";
			for (int j = str1[i].length() - 1; j >= 0; j--) {

				str2 = str2 + str1[i].charAt(j);

			}

			str3 = str3 + " " + str2;
		}

		System.out.println(str3);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "there is an apple";

		reverseString(str);

	}

}
