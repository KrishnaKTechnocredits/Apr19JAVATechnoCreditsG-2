package nikitaG;

import java.util.Scanner;

public class A3Q4ReverseNo {

	int readValues() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number:");
		return sc.nextInt();
	}

	int reverserNo(int num) {
		int reverse = 0;
		while (num != 0) {
			reverse = reverse * 10;
			reverse = reverse + num % 10;
			num = num / 10;
		}
		return reverse;
	}

	public static void main(String[] args) {
		A3Q4ReverseNo a3q4ReverseNo = new A3Q4ReverseNo();
		System.out.println("Reversed No is :"+a3q4ReverseNo.reverserNo(a3q4ReverseNo.readValues()));
	}
}
