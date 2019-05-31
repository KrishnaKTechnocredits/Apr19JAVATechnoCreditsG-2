package shankarJ;

import java.util.Scanner;

public class Question6 {

	public static void main(String args[]) {
		
		//WAP to print factorial number

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number:");

		int num = scanner.nextInt();

		int factorial = fact(num);
		System.out.println("Factorial number : " + factorial);
		scanner.close();
	}

	static int fact(int n) {
		int output;
		if (n == 1) {
			return 1;
		}

		output = fact(n - 1) * n;
		
		return output;
		
		
	}
}
