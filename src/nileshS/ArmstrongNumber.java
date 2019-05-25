package nileshS;
import java.util.Scanner;

class ArmstrongNumber
{
	public static void main(String [] args)
	{
		int num;
		int x,y;
		int  a1=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		num = sc.nextInt();
		int n1=num;
		while(num>0)
			{
				x = num%10;
				a1 = a1 + (x*x*x);
				y = num/10;
				num=y;
			}
			System.out.println(a1);
		if(a1==n1)
			System.out.print("Number is armstrong");
		else
			System.out.print("Number is not armstrong");
		
	}
}