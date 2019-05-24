/* String program assignments Q4 */
package snehaN;

import java.util.Scanner;

public class ReverseNumber {
	
	void printReverseNum(int numR)
	{
		int num1;
		while(numR>0)
		{
		num1=numR%10;
		numR=numR/10;
		System.out.print(num1);
		}
	}
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number which you want to reverse");
		int num=sc.nextInt();
		ReverseNumber r1=new ReverseNumber();
		r1.printReverseNum(num);
		sc.close();
	}

}
