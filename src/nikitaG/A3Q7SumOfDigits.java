package nikitaG;

import java.util.Scanner;

public class A3Q7SumOfDigits {

	int readValues() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number:");
		return sc.nextInt();
	}
	
	int sum(int num) {
		int temp = 0;
		while (num != 0) {
			temp = temp + num % 10;
			num = num / 10;
		}
		return temp;
	}
	
	public static void main(String[] args) {
		A3Q7SumOfDigits a3q7SumOfDigits = new A3Q7SumOfDigits();
		System.out.println("Sum of digits of number is :"+a3q7SumOfDigits.sum(a3q7SumOfDigits.readValues()));
	}
}
