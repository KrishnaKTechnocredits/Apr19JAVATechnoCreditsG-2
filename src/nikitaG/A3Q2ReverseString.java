package nikitaG;

import java.util.Scanner;

public class A3Q2ReverseString {

	void reverseString(String input) {
		String reverseString = "";
		for (int i = input.length() - 1; i >= 0; i--) {
			reverseString += input.charAt(i);
		}
		System.out.println(reverseString);
	}

	String readValues() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a string:");
		return sc.nextLine();
	}

	public static void main(String[] args) {
		A3Q2ReverseString a3q2ReverseString = new A3Q2ReverseString();
		a3q2ReverseString.reverseString((a3q2ReverseString.readValues()));
	}
}
