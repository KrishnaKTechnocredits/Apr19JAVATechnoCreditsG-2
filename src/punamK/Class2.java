package punamK;

import java.util.Scanner;

public class Class2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbers");
		int[] num = new int[5];
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}
		class2(num);

	}

	static void class2(int[] num1) {
		boolean flag = false;
		for (int i = 0; i < num1.length; i++) {
			for (int j = i + 1; j < num1.length; j++) {
				if (num1[i] == num1[j]) {
					flag = true;
					System.out.println("Duplicate : " + num1[i]);
					break;
				}
			}
		}
		if (flag == false) {
			System.out.println("No duplicates");
		}
	}

}
