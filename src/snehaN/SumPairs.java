/* Array assignments
 	Q7
 */
package snehaN;
import java.util.Scanner;
public class SumPairs {
	
	void findPairs(int[] arr,int sum)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]+arr[j]==sum)
                {
                    System.out.println("numbers are :"+arr[i]+" and "+arr[j]);
                }
            }
        }
    }

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter numbers in the array");
		String arr=sc.nextLine();
		String data[]=arr.split(" ");
		int newArr[]=new int[data.length];
		for(int i=0;i<data.length;i++)
		{
			newArr[i]=Integer.parseInt(data[i]);
		}
		System.out.println("enter the sum ");
		int sum=sc.nextInt();
		SumPairs n1=new SumPairs();
		n1.findPairs(newArr,sum);
	}
}
