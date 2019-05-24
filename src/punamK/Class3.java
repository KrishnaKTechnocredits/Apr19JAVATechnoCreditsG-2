package punamK;

import java.util.Scanner;

public class Class3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[5];
		System.out.println("Enter number elements :");
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}
		findNo(num, 4);

	}// main

	static void findNo(int[] num1, int number) {
		int var = 0;
		for (int i = 0; i < num1.length; i++) {
			if (number == num1[i]) {
				System.out.println("Number Present is " + number);
				var = 1;
				break;
			}
		}
		if (var == 0) {
			System.out.println("Not present");
		}

	}
}
