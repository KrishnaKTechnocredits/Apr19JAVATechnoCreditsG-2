/*
  Q2
  # * # *
  * # * #
  # * # *
  * # * #
 */

package snehaN;

public class Pattern2 {
	
    void pattern2(int rows)
    {
    	for(int i=1;i<=rows;i++)
    	{   
    		if(i%2==0)
    		{
    			for(int j=1;j<=rows;j++)
                {
    				if(j%2==0)
                    {
                        System.out.print("#");
                    }
                    else
                    {
                        System.out.print("*");
                    }
                }
    		}
    		else
    		{
                for(int j=1;j<=rows;j++)
                    {
                		if(j%2==0)
                        {
                            System.out.print("*");
                        }
                        else
                        {
                            System.out.print("#");
                        }
                    }
             }
    		System.out.println();   
    	}
     }

    public static void main(String[] args) 
    {
    	Pattern2 p2=new Pattern2();
    	p2.pattern2(4);
    }
}
