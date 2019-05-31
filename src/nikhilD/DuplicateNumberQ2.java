package nikhilD;

public class DuplicateNumberQ2 {
	//Find Duplicate Number on Integer array in java
 

	 	void duplicateNumber(int[] arr) {
			int counter = 0;
			for (int i = 0; i < arr.length; i++) {
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[i] == arr[j]) {
						System.out.println("Duplicate number in array is :" + arr[j]);
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

	 		int[] arr = { 1, 0, 3, 1, 0, 8 };

	 		DuplicateNumberQ2 q2 = new DuplicateNumberQ2();
			q2.duplicateNumber(arr);

	 	}

	 }
	  


