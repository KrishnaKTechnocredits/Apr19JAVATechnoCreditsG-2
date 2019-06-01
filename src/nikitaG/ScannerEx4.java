package nikitaG;

import java.util.Scanner;

public class ScannerEx4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Line");
		String line = sc.nextLine();
		String[] data = line.split(" ");
		for(int i = 1; i<=Integer.parseInt(data[2]);i++){
			System.out.println(data[0]+" "+data[1]+" "+i);
		}
		sc.close();
	}
}
