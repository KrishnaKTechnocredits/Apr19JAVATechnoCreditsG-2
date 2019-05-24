/* Array assignments
 	Q1
 */
package snehaN;

import java.util.Scanner;

public class MissingNum {
	
	void findMissingNum(int max,int[] x)
	{
		for(int i=1;i<=max;i++)
		{
			boolean flag=false;
			for(int j=0;j<x.length;j++)
				{
					if(i==x[j])
					{
						flag=true;
						break;
					}
				}
					if(flag==false)
					{
						System.out.println("missing number is "+i);
						break;
					}
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter end number");
		int maxNum=Integer.parseInt(sc.nextLine());
		System.out.println("Enter Numbers");
		String numbers=sc.nextLine();
		String[] data=numbers.split(" ");
		int num[]=new int[data.length];
		
		for(int i=0;i<data.length;i++)
		{
			num[i]=Integer.parseInt(data[i]);
		}
		
		MissingNum m1=new MissingNum();
		m1.findMissingNum(maxNum,num);
		sc.close();
	}
}
