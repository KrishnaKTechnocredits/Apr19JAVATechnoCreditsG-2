package navjeetK;

//To find second largest element in the array

public class Assignment5 {

	void arraySorting(int[] arr2) {
		for (int i = 0; i < arr2.length; i++) {
			for (int j = i + 1; j < arr2.length; j++) {
				if (arr2[i] > arr2[j]) {
					int temp = arr2[i];

					arr2[i] = arr2[j];

					arr2[j] = temp;
				}
			}
		}

		System.out.println("Array Elements in Ascending Order: ");

		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}

		System.out.println("Second larget elements in Array is : " + arr2[(arr2.length) - 2]);

	}

	public static void main(String[] args) {
		int[] arr1 = { 2, 5, 7, 6, 9, 8 };

		Assignment5 a5 = new Assignment5();

		a5.arraySorting(arr1);
	}
}
