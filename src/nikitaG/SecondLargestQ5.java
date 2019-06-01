package nikitaG;

import java.util.Scanner;

public class SecondLargestQ5 {

	void display(int[] numArr) {
		int max = numArr[0];
		int second = numArr[1];
		if (max < second) {
			second = numArr[0];
			max = numArr[1];
		}
		for (int i = 2; i < numArr.length; i++) {
			if (numArr[i] > max) {
				second = max;
				max = numArr[i];
			}
			if (second < numArr[i] && numArr[i] < max)
				second = numArr[i];
			if (second == max && numArr[i] < max)
				second = numArr[i];
		}
		System.out.println("Second largest number in an array is " + second);
	}

	int[] readValues() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter numbers : ");
		String[] lineArr = sc.nextLine().split(" ");
		int[] data = new int[lineArr.length];
		for (int i = 0; i < data.length; i++)
			data[i] = Integer.parseInt(lineArr[i]);
		sc.close();
		return data;
	}

	public static void main(String[] args) {
		SecondLargestQ5 q5 = new SecondLargestQ5();
		q5.display(q5.readValues());
	}
}
