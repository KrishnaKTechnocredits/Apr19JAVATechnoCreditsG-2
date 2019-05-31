package shankarJ;

public class QuestionNo3 {
	//Check if array contains a number in Java?
	
	public static void main(String[] args) {
		int toFind = 8;
		int[] arr = { 2, 5, 9, 7, 4, 6 };
		boolean numFound = false;
		if (numFound)
			System.out.println(toFind + " is found");
		else
			System.out.println(toFind + " number is not in arr.");
	}

	public static boolean numFound(int[] arr, int toFind) {

		for (int n : arr) {
			if (n == toFind) {
				return true;

			}

		}
		return false;

	}

}
