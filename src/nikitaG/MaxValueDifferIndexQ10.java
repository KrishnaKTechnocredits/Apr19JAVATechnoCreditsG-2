package nikitaG;

import java.util.Scanner;

public class MaxValueDifferIndexQ10 {

	void showDifferIndex(int[] arr1, int[] arr2) {
		if (arr1.length != arr2.length)
			System.out.println("Arrays not identical.");
		else
		{
			for (int i = 0; i < arr1.length; i++) {
				if (arr1[i] != arr2[i]) {
					System.out.println("Values are not matching at index ->"+i);
					System.out.println("From ("+arr1[i]+","+arr2[i]+") Max value is "+Integer.max(arr1[i], arr2[i]));
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
		MaxValueDifferIndexQ10 maxValueDifferIndexQ10 = new MaxValueDifferIndexQ10();
		maxValueDifferIndexQ10.showDifferIndex(maxValueDifferIndexQ10.readValues(), maxValueDifferIndexQ10.readValues());
	}
}
