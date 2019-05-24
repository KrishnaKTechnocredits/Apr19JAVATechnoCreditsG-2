/*
1 * 3 *
* 2 * 4
1 * 3 *
* 2 * 4

 */


package snehaN;

public class Pattern4 
{
	void trickyPattern(int rows)
	{
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=rows;j++)
				{
						if(i%2!=0)
						{
							if(j%2==0)
							{
								System.out.print("*");
							}
							else
							{
								System.out.print(j);
							}
						}
						else
						{
							if(j%2==0)
							{
								System.out.print(j);
							}
							else
							{
								System.out.print("*");
							}
						}
				}
				System.out.println();
		}
	}
	
		public static void main(String[] args) 
		{
			Pattern4 p1=new Pattern4();
			p1.trickyPattern(4);
		}
}
