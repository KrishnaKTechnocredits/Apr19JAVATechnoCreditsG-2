package shankarJ;

import java.util.Scanner;

public class Question11 {
	
	//11) WAP to find given string is palidrome or not

	public static void main(String args[])
    {
        String a, b = "";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string you want to check:");
        a = sc.nextLine();
        int n = a.length();
        for(int i = n - 1; i >= 0; i--)
        {
            b = b + a.charAt(i);
        }
        if(a.equalsIgnoreCase(b))
        {
            System.out.println("The string is palindrome.");
        }
        else
        {
            System.out.println("The string is not palindrome.");
            sc.close();
        }
    }

}
