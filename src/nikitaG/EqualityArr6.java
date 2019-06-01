package nikitaG;

import java.util.Scanner;

public class EqualityArr6 {

	boolean checkEqualityArray(int[] firstArray, int[] secondArray) {
		boolean flag = true;
		if(firstArray.length != secondArray.length)
			return false;
		for (int i = 0; i < firstArray.length; i++){
			if(firstArray[i] != secondArray[i])
				flag = false;
		}
		return flag;
	}

	public static void main(String[] args) {
		EqualityArr6 equalityArr6 = new EqualityArr6();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter array size : ");
		int size = sc.nextInt();
		System.out.println("Please enter numbers in first array : ");
		int[] firstArray = new int[size];
		for (int i = 0; i < size; i++) {
			firstArray[i] = sc.nextInt();
		}

		System.out.println("Please enter numbers in second array : ");
		int[] secondArray = new int[size];
		for (int i = 0; i < size; i++) {
			secondArray[i] = sc.nextInt();
		}
		
		if(equalityArr6.checkEqualityArray(firstArray, secondArray))
			System.out.println("Arrays are identical");
		else
			System.out.println("Arrays are not identical");
		
		sc.close();
	}
}
