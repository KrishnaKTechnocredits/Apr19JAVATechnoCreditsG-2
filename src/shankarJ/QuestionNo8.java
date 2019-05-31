package shankarJ;

public class QuestionNo8 {
	//Find first differ index from given arrays

	static int findUncommonIndex(int arr1[], int arr2[], int n) {
		for (int i = 0; i < n; i++)
			if (arr1[i] != arr2[i])
				return i;

		return n;
	}

	public static void main(String[] args) {
		int arr1[] = { 10, 2, 9, 14, 31 };
		int arr2[] = { 10, 2, 18, 14, 3 };
		int n = arr2.length;

		System.out.println("Values are not matching at index -> " + findUncommonIndex(arr1, arr2, n));
	}
}
