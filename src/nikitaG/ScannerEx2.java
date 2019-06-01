package nikitaG;

import java.util.Scanner;

public class ScannerEx2 {
	
	public static void main(String[] args) {
		int[] num = new int[5];
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.println("Please enter 5 numbers: ");
		for(int i = 0;i<num.length;i++){
			//num[i] = sc.nextInt();
			sum = sum + sc.nextInt();
		}
		System.out.println("Total Sum : "+sum);
		//System.out.println(num);
		sc.close();
	}
}
