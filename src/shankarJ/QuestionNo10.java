package shankarJ;

public class QuestionNo10 {
	// Find max value at differed index
	
	static int findUncommonIndex(int arr1[], int arr2[], int n, int m) {
		for (int i = 0; i < n; i++)
			if (arr1[i] != arr2[i])
				return i;
		for (int j = 0; j < m; j++)
			if (arr2[j] != arr1[j])
				return j;
		return m;
	}

	public static void main(String[] args) {
		int arr1[] = { 10, 2, 9, 14, 31 };
		int arr2[] = { 10, 2, 18, 14, 3 };
		int n = arr1.length;
		int m = arr2.length;
		System.out.println("Values are not matching at index -> " + findUncommonIndex(arr1, arr2, n,m));
	}
}
