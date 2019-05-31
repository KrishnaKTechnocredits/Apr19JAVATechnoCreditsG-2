package punamK.assignment3String;

import java.util.Scanner;

public class ArmStrongNo {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int input= sc.nextInt();
		armStrong(input);
		
	}
	static void armStrong(int input){
		int sum = 0;
		int input1=input;
		while (input != 0)
		{
		int remainder = input%10;
		sum = sum + remainder*remainder*remainder;
		input=input/10;
		
	}
		if( sum == input1){
			System.out.println("Armstrong No : " + input1);
		}
		else{
			System.out.println("Not an armstrong No");
		}

}
}	
	
