package punamK.assignment3String;

import java.util.Scanner;

public class SeparateDigitChar {
	public static void main(String [] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter alphanumeric string");
		String input=sc.next();
		separateDigitChar(input);
	}
	
	static void separateDigitChar(String input){
		String alpha="";
		String digit="";
		for( int i=0; i<input.length(); i++){
			{
				if(Character.isAlphabetic(input.charAt(i))){
					alpha= alpha + input.charAt(i);
				}
				else if(!Character.isAlphabetic(input.charAt(i))){
					digit= digit + input.charAt(i);
				}
			}
		}System.out.println(alpha + digit);
	}

}
