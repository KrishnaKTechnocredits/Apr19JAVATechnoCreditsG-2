package punamK.coreJavaAssignement3;

import java.util.Scanner;

//leap year
public class Que3 {
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter year");
		int input= sc.nextInt();
		leapYr(input);
	}
	static void leapYr(int input){
		String leapYr= (input%4==0) ? "Leap year" : "Not a Leap Year";
		System.out.println(leapYr);
	}

}
