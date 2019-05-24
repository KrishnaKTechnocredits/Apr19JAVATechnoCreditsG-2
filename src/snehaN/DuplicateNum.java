/* Array assignments
 	Q2
 */
package snehaN;

import java.util.Scanner;

public class DuplicateNum {
	
	void findDuplicate(int x[],int max)
	{
		for(int i=0;i<x.length;i++)
		{
			for(int j=i+1;j<x.length;j++)
				{
					if(x[i]==x[j])
					{
						System.out.println("duplicate number is "+x[i]);
					}
				}
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number limit");
		int maxNum=Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter numbers");
		String numbers=sc.nextLine();
		String[] data=numbers.split(" ");
		int num[]=new int[data.length];
		
		for(int i=0;i<data.length;i++)
		{
			num[i]=Integer.parseInt(data[i]);
		}
		
		DuplicateNum d1=new DuplicateNum();
		d1.findDuplicate(num,maxNum);
		
		
		
		sc.close();
		
	}
}
