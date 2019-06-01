package nikitaG;

import java.util.Scanner;

public class FindNumQ3 {


	boolean checkNum() {
		boolean flag = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter array size:");
		int arrLen = sc.nextInt();		
		int numArr[] = new int[arrLen];
		System.out.println("Please enter numbers");
		for (int i = 0; i < arrLen; i++)
			numArr[i] = sc.nextInt();
		System.out.println("Please enter a number:");
		int num = sc.nextInt();
		for (int i = 0; i < arrLen; i++){
			if(numArr[i]==num){
				flag = true;
				break;
			}
		}
		if(flag)
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		FindNumQ3 q3 = new FindNumQ3();
		if(q3.checkNum())
			System.out.println("Number exists in array");
		else
			System.out.println("Number doesn't exist in array");
	}
}
