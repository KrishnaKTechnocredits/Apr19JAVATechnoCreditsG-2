/* String program assignments Q6 */
package snehaN;

import java.util.Scanner;

public class IfFactorial {
	
	void printFactorial(int num)
	{
		for(int i=num-1;i>0;i--)
		{
			num=num*i;
		}
		System.out.println(num);
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to print factorial of number");
		int number=sc.nextInt();
		IfFactorial f1=new IfFactorial();
		f1.printFactorial(number);
		sc.close();
	}

}
