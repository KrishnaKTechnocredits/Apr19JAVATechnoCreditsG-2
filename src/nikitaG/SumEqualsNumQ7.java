package nikitaG;

import java.util.Scanner;

public class SumEqualsNumQ7 {

	int[] input;
	int num;

	void readValues() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter numbers : ");
		String[] lineArr = sc.nextLine().split(" ");
		int[] data = new int[lineArr.length];
		for (int i = 0; i < data.length; i++)
			data[i] = Integer.parseInt(lineArr[i]);
		System.out.println("Please enter sum");
		num = sc.nextInt();
		sc.close();
		input = data;
	}

	void displaySumpairs() {
		for (int i = 0; i < input.length; i++) {
			for (int j = i + 1; j < input.length; j++) {
				if (input[i] + input[j] == num)
					System.out.println("{" + input[i] + "," + input[j] + "}");
			}
		}
	}

	public static void main(String[] args) {
		SumEqualsNumQ7 sumEqualsNumQ7 = new SumEqualsNumQ7();
		sumEqualsNumQ7.readValues();
		sumEqualsNumQ7.displaySumpairs();
	}
}
