package punamK.assignment3String;

import java.util.Scanner;

public class ReverseWord {
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter String to reverse");
	String[] input= sc.nextLine().split(" ");
	reverseString(input);
}
	static void reverseString(String[] input){
		for (int i=0;i<input.length; i++){
			String value=input[i];
			reverseEachLetter(value);
		}
	}
	static void reverseEachLetter(String value){
		String temp = "";
		for (int i= value.length()-1; i>=0; i--){
			temp = temp + value.charAt(i);
		}System.out.print(temp + " ");
		
	}
}
