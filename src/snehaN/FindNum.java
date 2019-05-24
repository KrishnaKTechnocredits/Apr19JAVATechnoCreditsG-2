/* Array assignments
 	Q3
 */
package snehaN;

import java.util.Scanner;

public class FindNum {
	
	void ifContains(int[] arr,int num)
	{
	
		boolean flag=false;
		for(int i=0;i<arr.length;i++)
		{
			if(num==arr[i])
			{
				flag=true;
				System.out.println(num+" is present in an array at "+i+" index");
				break;
			}
		}
			if(flag==false)
			{
				System.out.println("Number is not present in array");
			}
	}
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the numbers ");
		String data=sc.nextLine();
		String[] num=data.split(" ");
		int[] array=new int[num.length];
		for(int i=0;i<num.length;i++)
		{
			array[i]=Integer.parseInt(num[i]);
		}
		
		System.out.println("Enter the number which you want to find");
		int number=sc.nextInt();
		
		FindNum f1=new FindNum();
		f1.ifContains(array,number);
	}
}
