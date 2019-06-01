package nikitaG;

import java.util.Scanner;

public class ScannerEx3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter first, last name & array size :");
		String fName = sc.next();
		String lName = sc.next();
		int arrayLength = sc.nextInt();
		
		for(int i=1;i <=arrayLength;i++){
			System.out.println(fName+" "+lName+" "+i);
		}
		sc.close();
	}
}
