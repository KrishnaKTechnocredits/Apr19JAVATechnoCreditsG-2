package punamK.assignment3String;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int number= sc.nextInt();
		factorial(number);
	}
	static void factorial(int number){
		int factorial = 1;
		for (int i=1; i <= number; i++){
			factorial= factorial * i;
		}System.out.println("Factorial is : " +factorial);
	}

}
