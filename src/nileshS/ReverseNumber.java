package nileshS;
import java.util.Scanner;

class ReverseNumber
{
	public static void main(String [] args)
	{
		int num;
		int x,y;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		num = sc.nextInt();
			while(num>0)
			{
				x = num%10;
				y = num/10;
				num=y;
				System.out.print(x);
			}
	}

}