package navjeetK;

//Write a java program to check the equality of two arrays

public class Assignment6 {

	void equalArray(int[] arr3, int[] arr4) {
		int counter1 = 0;

		for (int i = 0; i < arr3.length; i++) {

			int counter = 0;

			for (int j = i; j <= i; j++) {

				if (arr3[i] == arr4[i]) {

					counter = counter + 1;
				}

			}

			if (counter != 0) {

				counter1 = counter1 + 1;
			}
		}

		if (counter1 == arr3.length) {
			System.out.println("Two arrays are equal");
		} else {
			System.out.println("Two arrays are not equal");
		}

	}

	public static void main(String[] args) {
		int[] arr1 = { 10, 2, 9, 14, 3 };

		int[] arr2 = { 10, 2, 9, 14, 3 };

		Assignment6 a6 = new Assignment6();

		a6.equalArray(arr1, arr2);

	}
}
