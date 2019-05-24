/* String program assignments Q8 */
package snehaN;

import java.util.Scanner;

public class Separation {
	
	void sepDigitChars(String NumChar)
	{
	    String Char="";
	    String Num="";
	    int i;
	            for(i=0;i<NumChar.length();i++)
	                    {
	                       if(NumChar.charAt(i)=='0' || NumChar.charAt(i)=='1' || NumChar.charAt(i)=='2' || NumChar.charAt(i)=='3' || NumChar.charAt(i)=='4' || NumChar.charAt(i)=='5' || NumChar.charAt(i)=='6' || NumChar.charAt(i)=='7' || NumChar.charAt(i)=='8' || NumChar.charAt(i)=='9')
	                       {
	                    	   Num=Num+NumChar.charAt(i);
	                       }
	                       else
	                       {
	                           Char=Char+NumChar.charAt(i);
	                       }
	                    }
	                    System.out.print(Char+" "+Num);
	}
	       
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter line");
		String data=sc.nextLine();
		Separation s1=new Separation();
		s1.sepDigitChars(data);
	}
}
