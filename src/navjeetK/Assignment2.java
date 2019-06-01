package navjeetK;

//Find Duplicate Number on Integer array in java

public class Assignment2 {

	void duplicateNumber(int[] arr2) {
		int counter = 0;
		for (int i = 0; i < arr2.length; i++) {
			for (int j = i + 1; j < arr2.length; j++) {
				if (arr2[i] == arr2[j]) {
					System.out.println("Duplicate number in array is :" + arr2[i]);
					counter = counter + 1;
					break;
				}

			}
		}

		if (counter == 0) {
			System.out.println("No Duplicate number in array");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr1 = { 7, 0, 3, 1, 5, 7 };

		Assignment2 a2 = new Assignment2();
		a2.duplicateNumber(arr1);

	}

}
