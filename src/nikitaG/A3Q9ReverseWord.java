package nikitaG;

import java.util.Scanner;

public class A3Q9ReverseWord {

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
		A3Q9ReverseWord a1 = new A3Q9ReverseWord();
		String[] str = a1.readValues().split(" ");
		System.out.print("Reversed string is :");
		for(int i=0;i<str.length;i++)
			System.out.print(a1.reverseWord(str[i])+" ");	
	}
}
