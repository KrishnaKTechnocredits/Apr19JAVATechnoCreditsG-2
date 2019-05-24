package punamK;

import java.util.Scanner;

public class Class4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number elements");
		int[] num = new int[6];
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		} // Input first array integer num
		max(num);
		min(num);
		unsorted(num, 9);
	}

	static void max(int[] num1) {
		int count = num1[0];
		for (int j = 0; j < num1.length; j++) {
			if (count < num1[j]) {
				count = num1[j];

			}
		}
		System.out.println("Max no = " + count);
	}

	static void min(int[] num2) {
		int count = num2[0];
		for (int k = 0; k < num2.length; k++) {
			if (count > num2[k]) {
				count = num2[k];
			}
		}
		System.out.println("Min no : " + count);
	}

	static void unsorted(int[] num3, int sum) {
		boolean sumFound = false;
		for (int i = 0; i < num3.length; i++) {
			for (int j = i + 1; j < num3.length; j++) {
				if (sum == num3[i] + num3[j]) {
					System.out.println(num3[i] + " and " + num3[j]);
					sumFound = true;
					break;
				}
			}
			if (sumFound == true) {
				break;
			}
		}
		if (sumFound == false) {
			System.out.println("Sum not found");
		}
	}

}
