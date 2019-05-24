/*
4321
432
43
4
 */


package snehaN;

public class Pattern3 {
    
    void pattern3(int rows)
    {
    	for(int i=1;i<=rows;i++)
        {   
           for(int j=rows;j>=i;j--)
           {
               System.out.print(j); 
           }
           System.out.println();   
        }  
    }
    
    public static void main(String[] args) 
	{
	   Pattern3 p3=new Pattern3();
	   p3.pattern3(4);
	}
}

