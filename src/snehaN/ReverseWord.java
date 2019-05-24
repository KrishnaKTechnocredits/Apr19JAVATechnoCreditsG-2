/* String program assignments Q9 */
package snehaN;

import java.util.Scanner;

public class ReverseWord {
		
		void printReverseWord(String str[])
		{
			int k=0;
			char line[]=new char[str.length];
			for(int i=0;i<str.length;i++)
			{
				for(int j=str[i].length()-1;j>=0;j--)
				{
					line[k]=str[i].charAt(j);
					System.out.print(line[k]);
				}
				System.out.print(" ");
			}
		}
	
		public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter line");
		String line=sc.nextLine();
		String arr[]=line.split(" ");
		ReverseWord r1=new ReverseWord();
		r1.printReverseWord(arr);
	}
}
