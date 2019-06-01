package nikitaG;

import java.util.Scanner;

public class A3Q11Palindrome {

	String readValues() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		return sc.nextLine();
	}

	String reverseWord(String input) {
		String output = "";
		for (int i = input.length()-1; i >= 0; i--) {
			output += input.charAt(i);
		}
		return output;
	}
	
	public static void main(String[] args) {
		A3Q11Palindrome a1 = new A3Q11Palindrome();
		String str1 = a1.readValues();
		String str2 = a1.reverseWord(str1);
		if(str1.equals(str2))
			System.out.println(str1+" is palindrome");
		else
			System.out.println(str1+" is not a palindrome");
	}
}
