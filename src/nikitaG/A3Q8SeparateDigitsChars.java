package nikitaG;

import java.util.Scanner;

public class A3Q8SeparateDigitsChars {

	String readValues() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		return sc.nextLine();
	}

	String separateDigitsChars(String input) {
		String chars = "";
		String digits = "";
		for (int i = 0; i < input.length(); i++){
			if(Character.isDigit(input.charAt(i)))
				digits += input.charAt(i);
			else if(Character.isLetter(input.charAt(i)))
					chars += input.charAt(i);
		}
			return chars + " " + digits;
	}

	public static void main(String[] args) {
		A3Q8SeparateDigitsChars a1 = new A3Q8SeparateDigitsChars();
		System.out.println("String after separation is :"+a1.separateDigitsChars(a1.readValues()));
	}
}
