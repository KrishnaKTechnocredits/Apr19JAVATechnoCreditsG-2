package payalY;

public class ForInInFor2 
{
	static void printi()
	{
		for(int i=1;i<=10;i++) 
		//defines no Of Rows in pattern printing
		{
			for(int j=1;j<=i;j++)
		//defines no of columns in pattern printing
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
	static void printj()
		{
			for(int i=1;i<=5;i++) 
			//defines no Of Rows in pattern printing
			{
				for(int j=1;j<=i;j++)
			//defines no of columns in pattern printing
				{
					System.out.print(j+" ");
				}
				System.out.println();
			}
	}
	public static void main(String[] args)
	{
		printi();
		printj();
	}
}
