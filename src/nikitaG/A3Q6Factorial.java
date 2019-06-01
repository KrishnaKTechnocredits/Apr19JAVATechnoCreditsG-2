package nikitaG;

import java.util.Scanner;

public class A3Q6Factorial {

	int readValues() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number:");
		return sc.nextInt();
	}

	int displayFactorial(int num) {
		int fact = 1;
		for (int i = 1; i <= num; i++) 
			fact = fact * i;
		return fact;
	}
	
	public static void main(String[] args) {
		A3Q6Factorial a3q6Factorial = new A3Q6Factorial();
		System.out.println("Factorial of a num is :"+a3q6Factorial.displayFactorial(a3q6Factorial.readValues()));
	}
}
