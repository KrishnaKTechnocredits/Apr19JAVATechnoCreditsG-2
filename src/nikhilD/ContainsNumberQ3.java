package nikhilD;

public class ContainsNumberQ3 {
	//Check if array contains a number in Java
	 	
	void arrayContain(int[] arr, int digit) {
			int counter = 0;
			for (int i = 0; i < arr.length; i++) {
				if (digit == arr[i]) {
					counter = counter + 1;
				}
			}

	 		if (counter == 0) {
				System.out.println(digit + " is not in array");
			} else {
				System.out.println(digit + " is in array");
			}
		}

	 	public static void main(String[] args) {
		
	 		int[] arr = { 2, 5, 9, 7, 4, 6 };

	 		ContainsNumberQ3 q3 = new ContainsNumberQ3();
			q3.arrayContain(arr, 30);
			q3.arrayContain(arr, 4);

	 	}

}


