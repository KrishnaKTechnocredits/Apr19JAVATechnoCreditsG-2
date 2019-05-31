package punamK.coreJavaAssignement3;

import java.util.Scanner;

//Ternary operator
public class Que2 {
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		int num1= sc.nextInt();
		int num2= sc.nextInt();
		ternary(num1,num2);
		
	}
	static void ternary(int num1, int num2){
			int	greaterNo= (num1 > num2) ? num1 : num2;
			System.out.println("Greater number is "+ greaterNo);
	}
}
