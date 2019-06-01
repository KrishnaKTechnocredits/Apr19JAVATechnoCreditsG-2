package navjeetK;

public class Assignment7 {

	void equalSum(int[] arr2, int value1) {
		for (int i = 0; i < arr2.length; i++) {
			for (int j = i + 1; j < arr2.length; j++) {
				if ((arr2[i] + arr2[j]) == value1) {
					System.out.println("Integer numbers, whose sum is equal to value " + value1 + " are : " + arr2[i]
							+ " and  " + arr2[j]);
				}
			}
		}
	}

	public static void main(String[] str) {
		int[] arr1 = { 1, 2, 4, 3, 5, 7, 8, 9, 6, -2, 11 };

		Assignment7 a7 = new Assignment7();

		a7.equalSum(arr1, 9);
	}
}
