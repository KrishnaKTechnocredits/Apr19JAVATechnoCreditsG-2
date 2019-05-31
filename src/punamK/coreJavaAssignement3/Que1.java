package punamK.coreJavaAssignement3;

import java.util.Scanner;

public class Que1 {
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter 3 numbers");
		int[] num = new int[3];
		for (int i=0; i<num.length; i++){
			num[i]=sc.nextInt();
	}
		largestNo(num);

}
	static void largestNo(int[] num1){		
		if(num1[0] > num1[1] & num1[1]> num1[2]){
			System.out.println("Largest No : " +num1[0]);
		}
		else if(num1[0]<num1[2] & num1[1]<num1[2])
		{
			System.out.println("Largest No : "+num1[2]);
		}else
			System.out.println("Largest No : "+num1[1]);
					
		}
	}

