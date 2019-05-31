package punamK.coreJavaAssignement3;

import java.util.Scanner;

//Switch case: calculator program
public class Que4 {
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Operation and two numbers");
		String operation= sc.next();
		int num1=sc.nextInt();
		int num2=sc.nextInt();
	
		switchCase(operation, num1, num2);
	}
	static void switchCase(String operation, int num1, int num2){
		switch (operation){
		
		case "addition" :
			System.out.println("Addition is : " +(num1+num2));
			break;
		case "substraction" :
			System.out.println("Substraction is : " +(num1-num2));
			break;
		case "multiplication" :
			System.out.println("Multiplication is : " +(num1 * num2));
			break;
		case "division" :
			System.out.println("Division is : "+(num1/num2));
			break;
		}
	}
}
