/* Array assignments
 	Q6
 */
package snehaN;
import java.util.Scanner;
public class EqualityCheck {

	static boolean flag=false;
	void checkEquality(int x[],int y[])
	{
	    for(int i=0;i<x.length;i++)
	    {
	    	if(x[i]==y[i])
	        {
	            flag=true;
	            continue;
	        }
	        else
	        {
	             flag=false;
	             break;
	        }
	    }
	    
	   if(flag==true)
	    {
	        System.out.println("These two arrays are equal");
	    }
	   else
	   {
	        System.out.println("These two arrays are not equal ");
	   }
}
	
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    
	    System.out.println("Enter first array ");
	    String line=sc.nextLine();
	    String[] data=line.split(" ");
	    int arr[]=new int[data.length];
	    for(int i=0;i<arr.length;i++)
	    {
	        arr[i]=Integer.parseInt(data[i]);
	    }
	        
	    System.out.println("Enter second array ");
	    String line2=sc.nextLine();
	    String[] data2=line2.split(" ");
	    int arr2[]=new int[data2.length];
	    for(int j=0;j<arr2.length;j++)
	    {
	         arr2[j]=Integer.parseInt(data2[j]);
	    }
	        
	    EqualityCheck c1=new EqualityCheck();
	    c1.checkEquality(arr,arr2);
	 }
}





