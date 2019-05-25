package punamK;

import java.util.Scanner;

public class Class7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number elements");
		int[] num = new int[6];
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}
		unsorted(num, 9);
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
		}
		if (sumFound == false) {
			System.out.println("Sum not found");
		}
	}

}
