package shankarJ;

public class QuestionNo6 {
	//Write a java program to check the equality of two arrays?
	
	public static void main(String[] args) {
		int[] arrayOne = { 12, 15, 21, 35, 44 };

		int[] arrayTwo = { 12, 15, 21, 35, 44 };

		boolean areArraysEqual = true;

		if (arrayOne.length == arrayTwo.length) {
			for (int i = 0; i < arrayOne.length; i++) {
				if (arrayOne[i] != arrayTwo[i]) {
					areArraysEqual = false;

				}
			}
		} else {
			areArraysEqual = false;
		}

		if (areArraysEqual) {
			System.out.println("Two Arrays Are Equal");
		} else {
			System.out.println("Two Arrays Are Not equal");
		}
	}
}
