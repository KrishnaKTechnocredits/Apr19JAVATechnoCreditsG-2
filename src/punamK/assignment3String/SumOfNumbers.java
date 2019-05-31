package punamK.assignment3String;

import java.util.Scanner;

public class SumOfNumbers {
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number");
		int input= sc.nextInt();
		sumOfNo(input);
	}
	static void sumOfNo(int number){
		int sum =0;
		while(number != 0){
		int remainder= number % 10;
		sum = sum + remainder;
		number = number/10;
			
	}System.out.println("Sum of digits : " +sum);

}
}	
