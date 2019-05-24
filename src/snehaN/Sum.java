/* String program assignments Q7 */
package snehaN;

import java.util.Scanner;

public class Sum {
	
	int num1,sum;
	void sumOfDigits(int num)
	{
		while(num>0)
		{
		num1=num%10;
		num=num/10;
		sum=sum+num1;
		}
		System.out.print(sum);
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		Sum s1=new Sum();
		s1.sumOfDigits(num);
		
	}

}
