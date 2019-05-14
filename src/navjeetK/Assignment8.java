package navjeetK;

//Find first differ Index from given arrays

public class Assignment8 {

	void differIndex(int[] arr3, int[] arr4) {

		for (int i = 0; i < arr3.length; i++) {

			int counter = 0;

			for (int j = i; j <= i; j++) {

				if (arr3[i] == arr4[i]) {

					counter = counter + 1;
				}

			}

			if (counter == 0) {
				System.out.println("Array not matched at Index : " + i);

				break;
			}
		}

	}

	public static void main(String[] args) {
		int[] arr1 = { 10, 2, 9, 14, 3 };

		int[] arr2 = { 10, 2, 8, 14, 5 };

		Assignment8 a8 = new Assignment8();

		a8.differIndex(arr1, arr2);

	}
}
