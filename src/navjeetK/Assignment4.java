package navjeetK;

//Largest and smallest 

public class Assignment4 {

	static int highestNumber(int[] arr2) {
		int maxNumber = arr2[0];
		for (int i = 1; i < arr2.length; i++) {
			if (arr2[i] > maxNumber)
				maxNumber = arr2[i];
		}
		return maxNumber;
	}

	static int smallestNumber(int[] arr2) {
		int minNumber = arr2[0];
		for (int i = 1; i < arr2.length; i++) {
			if (arr2[i] < minNumber)
				minNumber = arr2[i];
		}
		return minNumber;
	}

	public static void main(String[] args) {
		int[] arr1 = { 2, 4, 6, 8, 7, 5, 9, 1 };

		int number1 = highestNumber(arr1);

		System.out.println("Largest number in array " + number1);

		int number2 = smallestNumber(arr1);

		System.out.println("Smallest number in array " + number2);

	}
}
