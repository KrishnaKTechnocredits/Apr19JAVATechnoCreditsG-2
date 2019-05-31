package shankarJ;

public class Question8 {

	//separate digits and characters from the user define string.
	
	public static void main(String[] args) {
		String input = "1a2b1cde0fghi8jk5l";
		DigitsAndAlphabets(input);
	}

	public static void DigitsAndAlphabets(String str) {
		String number = "";
		String letter = "";
		for (int i = 0; i < str.length(); i++) {
			char a = str.charAt(i);
			if (Character.isDigit(a)) {
				number = number + a;

			} else {
				letter = letter + a;

			}
		}
		System.out.println(letter + "\t" + number);

	}

}
