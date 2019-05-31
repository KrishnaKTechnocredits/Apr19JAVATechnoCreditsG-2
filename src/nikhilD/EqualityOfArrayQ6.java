package nikhilD;
import java.util.Arrays; 

public class EqualityOfArrayQ6 {
	//validate equality of 2 arrays

 	public static void main(String[] args) {
		int[] arr1 = { 21, 57, 11, 37, 24 };

 		int[] arr2 = { 21, 57, 11, 37, 25 };
 		
 		if (Arrays.equals(arr1,arr2)) 
            System.out.println("Same"); 
        else
            System.out.println("Not same"); 
 		
 	}
}
