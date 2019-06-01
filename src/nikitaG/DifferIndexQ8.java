package nikitaG;

import java.util.Scanner;

public class DifferIndexQ8 {

	void showDifferIndex(int[] arr1, int[] arr2) {
		if (arr1.length != arr2.length)
			System.out.println("Arrays not identical.");
		else
		{
			for (int i = 0; i < arr1.length; i++) {
				if (arr1[i] != arr2[i]) {
					System.out.println("Values are not matching at index ->"+i);
					break;
				}
			}
		}
	}

	int[] readValues() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter numbers : ");
		String[] lineArr = sc.nextLine().split(" ");
		int[] data = new int[lineArr.length];
		for (int i = 0; i < data.length; i++)
			data[i] = Integer.parseInt(lineArr[i]);
		
		return data;
	}

	public static void main(String[] args) {
		DifferIndexQ8 differIndexQ8 = new DifferIndexQ8();
		differIndexQ8.showDifferIndex(differIndexQ8.readValues(), differIndexQ8.readValues());
	}
}
