package nileshS;
import java.util.Scanner;

class NumberSum
{
	public static void main(String [] args)
	{
		int num;
		int x = 1;
		int sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		num = sc.nextInt();
		
		while(num>0)
		{
			x = num%10;
			int y = num/10;
			num=y;
			sum = sum+x;
		}
		System.out.println(" Digits sumation is: " +sum);
	}
}