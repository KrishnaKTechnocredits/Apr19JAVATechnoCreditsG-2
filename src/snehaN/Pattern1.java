/*Pattern Printing assignment-1
  Q1  
  *
  # #
  * * *
  # # # #
 */


package snehaN;

public class Pattern1 
{
		void pattern1(int rows)
		{
			for(int i=1;i<=rows;i++)
			{   
				for(int j=1;j<=i;j++)
				{
					if(i%2==0)
                     	{
                        	System.out.print("#");
                     	}
					else
						{
                        	System.out.print("*");
						}
				}
				System.out.println();   
			}
		}
		
		public static void main(String[] args) {
			Pattern1 p1=new Pattern1();
			   p1.pattern1(4);
		}
	}

