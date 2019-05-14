package navjeetK;

//Check if array contains a number in Java

public class Assignment3 {

	void arrayContain(int[] arr2, int value1) {
		int counter = 0;
		for (int i = 0; i < arr2.length; i++) {
			if (value1 == arr2[i]) {
				counter = counter + 1;
			}
		}

		if (counter == 0) {
			System.out.println(value1 + " is not in array");
		} else {
			System.out.println(value1 + " is in array");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr1 = { 2, 5, 9, 7, 4, 6 };

		Assignment3 a3 = new Assignment3();
		a3.arrayContain(arr1, 1);

	}

}
