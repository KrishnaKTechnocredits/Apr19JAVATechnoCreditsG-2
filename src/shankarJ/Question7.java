package shankarJ;

import java.util.Scanner;

public class Question7 {
	
	//WAP to print sum of digit(Consider Input as Integer not as String)
	
	public static void main(String args[]) {
		int m, n, sum = 0;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number:");
		m = s.nextInt();
		while (m > 0) {
			n = m % 10;
			sum = sum + n;
			m = m / 10;
		}
		System.out.println("Sum of Digits:" + sum);
		s.close();
	}
}