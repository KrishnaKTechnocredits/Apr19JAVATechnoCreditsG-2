package navjeetK;

public class CharacterOccuring {

	static void characterCount(String str, char ch) {

		String[] str1 = str.split(" ");

		int counter = 0;

		for (int i = 0; i < str1.length; i++) {
			for (int j = 0; j < str1[i].length(); j++) {
				if (str1[i].charAt(j) == ch) {
					counter = counter + 1;
				}
			}
		}

		if (counter >= 1) {
			System.out.println("Char is : " + ch + " and number of occurance = " + counter);
		} else
			System.out.println("Char is : " + ch + " and number of occurance = " + counter);

	}

	public static void main(String[] args) {

		String str = "hello how are you harsh?";

		characterCount(str, 'a');

	}

}
