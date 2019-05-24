package punamK;

import java.util.Scanner;

public class Class8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array1 elements");
		int[] num = new int[6];
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}
		System.out.println("Enter array2 elements");
		int[] num1 = new int[6];
		for (int i = 0; i < num1.length; i++) {
			num1[i] = sc.nextInt();
		}
		unsorted(num, num1);
	}

	static void unsorted(int[] num3, int[] num4) {
		boolean flag = false;
		int i = 0;
		for (i = 0; i < num3.length; i++) {
			if (num3[i] != num4[i]) {
				flag = true;
				System.out.println(num3[i] + " and " + num4[i] + " are different" + "Index: " + i);
				break;
			}
			}if(flag==false){
				System.out.println("Matched");

		}
			
	}

}
