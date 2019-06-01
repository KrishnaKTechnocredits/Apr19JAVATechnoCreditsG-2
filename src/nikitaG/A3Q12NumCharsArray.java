package nikitaG;

import java.util.Scanner;

public class A3Q12NumCharsArray {

	String[] readValues() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a values in array in single line");
		return sc.nextLine().split(" ");
	}
	
	void separateNosChars(String[] input) {
		String chars = "";
		String digits = "";
		for (int i = 0; i < input.length; i++){
			if(Character.isDigit(input[i].charAt(0)))
				digits += input[i]+", ";
			else if(Character.isLetter(input[i].charAt(0)))
				chars += input[i]+", ";
		}
		System.out.println("Numeric ->"+digits);
		System.out.println("String ->"+chars);
	}
	
	public static void main(String[] args) {
		A3Q12NumCharsArray a1 = new A3Q12NumCharsArray();
		a1.separateNosChars(a1.readValues());
	}
}
