package shankarJ;

public class QuestionNo4 {
	
	//Largest and smallest number in unsorted array?

	 static void findPair(int[] A, int sum) {

		for (int i = 0; i < A.length - 1; i++) {

			for (int j = i + 1; j < A.length; j++) {

				if (A[i] + A[j] == sum) {
					System.out.println("Pair found " + "{" + A[i] + "," + A[j] + "}");
					return;
				}
			}
		}

		System.out.println("Pair not found");
	}

	public static void main(String[] args) {
		int A[] = { 1, 4, 3, 6, 10, 8 };
		int n = 16;
		findPair(A, n);
	}

}
