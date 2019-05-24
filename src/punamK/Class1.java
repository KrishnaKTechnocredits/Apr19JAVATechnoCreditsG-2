package punamK;

import java.util.Scanner;

public class Class1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbers");
		int[] num = new int[9];
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}
		class1(num);
	}

	static void class1(int[] array) {
		int var = 0;
		for (int i = 1; i <= 10; i++) {
			for (int j = 0; j < array.length; j++) {
				if (i == array[j]) {
					var = 1;
					break;
				}var=0;
			}
			if (var == 0) {
				System.out.println("Missing No : " +i);
			}
		}
	}

}
