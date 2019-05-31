package nikhilD;

public class SecondLargestElementQ5 {
	//finding second largest element in the array

	 

	 	void sorting(int[] arr) {
			for (int i = 0; i < arr.length; i++) {
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[i] > arr[j]) {
						int temp = arr[i];

	 					arr[i] = arr[j];

	 					arr[j] = temp;
					}
				}
			}

	 		System.out.println("Array Elements in Ascending Order: ");

	 		for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
	 		System.out.println();
	 		System.out.println("Second larget element is : " + arr[(arr.length) - 2]);

	 	}

	 	public static void main(String[] args) {
			int[] arr = { 4, 7, 3, 6, 9, 10,1 };

			SecondLargestElementQ5 q5 = new SecondLargestElementQ5();

	 		q5.sorting(arr);
		}
}


