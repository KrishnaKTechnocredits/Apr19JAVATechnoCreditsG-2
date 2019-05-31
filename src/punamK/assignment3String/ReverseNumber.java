package punamK.assignment3String;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter integer to reverse");
		int input = sc.nextInt();
		reverseNumber(input);
		
	}
	static void reverseNumber(int input){
		while (input != 0)
		{
		int remainder = input%10;
		System.out.print(remainder);
		input = input/10;
		
		}
		
	}

}
