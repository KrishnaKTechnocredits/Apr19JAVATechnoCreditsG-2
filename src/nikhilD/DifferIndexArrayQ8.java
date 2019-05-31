package nikhilD;

public class DifferIndexArrayQ8 {
	
	void differArrayIndex(int[] arr1, int[] arr2) {

 		for (int i = 0; i < arr1.length; i++) {

 			int counter = 0;

 			for (int j = i; j <= i; j++) {

 				if (arr1[i] == arr2[i]) {

 					counter = counter + 1;
				}

 			}

 			if (counter == 0) {
				System.out.println("Array differs at Index : " + i);
 				break;
			}
		}

 	}

 	public static void main(String[] args) {
		int[] arr1 = { 10, 2, 9, 14, 3 };

 		int[] arr2 = { 10, 2, 8, 13, 3 };

 		DifferIndexArrayQ8 q8 = new DifferIndexArrayQ8();

 		q8.differArrayIndex(arr1, arr2);

 	}
}


