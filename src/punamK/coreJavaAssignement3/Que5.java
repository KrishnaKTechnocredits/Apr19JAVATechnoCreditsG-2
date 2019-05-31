package punamK.coreJavaAssignement3;

import java.util.Scanner;

public class Que5 {
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter No in between 1 and 7");
		int input= sc.nextInt();
		weekday(input);
	}
	static void weekday(int input){
		switch(input){
		case 1 :
			System.out.println("Monday");
			break;
		case 2 :
			System.out.println("Tuesday");
			break;
		case 3 :
			System.out.println("Wednesday");
			break;
		case 4 :
			System.out.println("Thursday");
			break;
		case 5 :
			System.out.println("Friday");
			break;
		case 6 :
			System.out.println("Saturday");
			break;
		case 7 :
			System.out.println("Sunday");
			break;
		default :
			System.out.println("Invalid entry: Please enter Numbers in between 1 and 7");
			break;
			
		}
	}

}
