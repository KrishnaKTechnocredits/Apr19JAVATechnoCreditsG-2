package nikhilD;

public class AllDifferIndexQ9 {
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
 				
			}
		}

 	}

 	public static void main(String[] args) {
		int[] arr1 = { 10, 2, 9, 14, 3 };

 		int[] arr2 = { 10, 2, 18, 14, 13 };

 		AllDifferIndexQ9 q9 = new AllDifferIndexQ9();

 		q9.differArrayIndex(arr1, arr2);

 	}
}



