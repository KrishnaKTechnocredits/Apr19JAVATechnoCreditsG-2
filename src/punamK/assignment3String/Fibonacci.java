package punamK.assignment3String;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Range");
		int range=sc.nextInt();
		fibonacci(range);
	}
	
	static void fibonacci(int range){
		int t1=0;
		int t2=1;
		int i=1;
		while(i<=range){
			System.out.println(t1 + " ");
			int sum=t1 + t2;
			t1=t2;
			t2=sum;
			i++;
		}
	}

}
