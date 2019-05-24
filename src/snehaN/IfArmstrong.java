/* String program assignments Q5 */
package snehaN;

import java.util.Scanner;

public class IfArmstrong 
{
	int num1;
	static int n1;
	int validateArmstrong(int num)
	{
		while(num>0)
		{
			num1=num%10;
			num=num/10;
			n1=n1+num1*num1*num1;
		}
		return n1;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to check if it is Armstrong or not");
		int num=sc.nextInt();
		IfArmstrong a1=new IfArmstrong();
		a1.validateArmstrong(num);
		if(num==n1)
		{
			System.out.println("Given Number "+num+" is Armstrong ");
		}
		else
		{
			System.out.println("Given Number "+num+" is not Armstrong");
		}
	}
}
