package nileshS;
import java.util.Scanner;

class FactorialNumber
{
	public static void main(String [] args)
	{
		int num;
		int x = 1;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		num = sc.nextInt();
		
		for(int i=1; i<=num; i++)
		{
			x= x*i;
		}
		System.out.println(num +" Factorial is: " +x);
	}
}	