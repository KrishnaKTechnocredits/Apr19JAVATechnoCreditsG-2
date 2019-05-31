package punamK.assignment3String;

import java.util.Scanner;

public class Question1ReverseString {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String in a line");
		String str=sc.nextLine();
		String[] str1=str.split(" ");
		reverse(str1);
		
	}
	
	static void reverse(String[] str2){
		for(int i=str2.length-1;i>=0;i--){
			//System.out.print(str2[i] +" ");
			wordreverse(str2[i]);
		}
	}
	static void wordreverse(String value){
		String temp= "";
		for (int i=value.length()-1;i>=0;i--){
			temp=temp+value.charAt(i);
		}
		System.out.print(temp + " ");
	}
}
