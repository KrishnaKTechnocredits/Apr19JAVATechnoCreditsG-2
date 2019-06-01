package nikitaG;

import java.util.Scanner;

public class ScannerEx1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter roll no :");
		int rno = sc.nextInt();
		System.out.println("user entered name is :"+rno);
		System.out.println("Please enter name :");
		String name = sc.next();
		//String line = sc.nextLine();
		System.out.println("user entered name is :"+name);
		sc.close();
	}
}
