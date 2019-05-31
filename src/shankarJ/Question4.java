package shankarJ;

import java.util.Scanner;

public class Question4 {
	//WAP to reverse number (Consider Input as Integer not as String).
	
	public static void reverseMethod(int number) {
		if (number < 10) {
			System.out.println(number);
			return;
		} else {
			System.out.print(number % 10);

			reverseMethod(number / 10);
		}
	}

	public static void main(String args[]) {
		int num = 0;
		System.out.println("Input your number : ");
		Scanner in = new Scanner(System.in);
		num = in.nextInt();
		System.out.print("Reverse number is:");
		reverseMethod(num);
		System.out.println();
		in.close();
	}
}
