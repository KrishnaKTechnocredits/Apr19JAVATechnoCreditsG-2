package nikitaG;

import java.util.Scanner;

public class A3Q3Fibonacci {

	int readValues() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number:");
		return sc.nextInt();
	}

	void fibonacci(int num) {
		int num1 = 0;
		int num2 = 1;
		int fSeries = 0;
		for (int i = 1; i <= num; i++) {
			System.out.print(num1+" ");
			fSeries = num1 + num2;
			num1 = num2;
			num2 = fSeries;
		}
	}
	
	public static void main(String[] args) {
		A3Q3Fibonacci a3q3Fibonacci = new A3Q3Fibonacci();
		a3q3Fibonacci.fibonacci(a3q3Fibonacci.readValues());
	}
}
