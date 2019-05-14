package navjeetK;

//Find Max Value at different Index

public class Assignment10 {

	void differentIndex(int[] arr3, int[] arr4) {

		for (int i = 0; i < arr3.length; i++) {
			if (arr3[i] == arr4[i]) {

			}

			else {
				System.out.println("Value not matched at index : " + i);

				if (arr3[i] > arr4[i]) {
					int max = arr3[i];

					System.out.println("From (" + arr3[i] + "," + arr4[i] + ") max value is : " + max);

				} else {
					int max = arr4[i];

					System.out.println("From (" + arr3[i] + "," + arr4[i] + ") max value is : " + max);
				}
			}
		}

	}

	public static void main(String[] str) {
		int[] arr1 = { 10, 2, 9, 14, 3 };

		int[] arr2 = { 10, 2, 8, 14, 5 };

		Assignment10 a10 = new Assignment10();

		a10.differentIndex(arr1, arr2);
	}
}
