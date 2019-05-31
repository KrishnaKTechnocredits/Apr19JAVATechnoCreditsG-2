package punamK.assignment3String;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter String");
		String str1= sc.next();
		palindrome(str1);
	}
	static void palindrome(String str1){
		String str2="";
		boolean flag= false;
		for (int i=str1.length()-1; i>=0 ; i--)
		{
			str2 = str2 + str1.charAt(i);
		}
		for (int i=0; i<str1.length(); i++){
			if(str1.charAt(i)!=str2.charAt(i)){
				break;
			}
			else if(str1.charAt(i)==str2.charAt(i)){
				flag= true;
				
			}
		}
		
		if(flag==false){
				System.out.println("Not Palindrome");
			} else{
				System.out.println("Palindrome");
			}
		}
	}


