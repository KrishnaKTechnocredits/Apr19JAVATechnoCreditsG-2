package navjeetK;

public class SeparateAlphabetsAndDigitsFromString {

	static void seprate(String str) {
		String number = "";
		String letter = "";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')

			{
				letter = letter + str.charAt(i);
			} else
				number = number + str.charAt(i);
		}

		System.out.println(number + letter);
	}

	public static void main(String[] args) {
		seprate("1a2b3c4defgh567jkl");

	}

}
