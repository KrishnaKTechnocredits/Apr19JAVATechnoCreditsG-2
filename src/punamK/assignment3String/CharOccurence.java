package punamK.assignment3String;

import java.util.Scanner;

public class CharOccurence {
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter String");
		String[] input= sc.nextLine().split(" ");
		charOccurence(input);
	}
	
	static void charOccurence(String[] input){
		String temp="";
		int count=0;
		for(int i=0; i<input.length; i++){
			temp=input[i];
			for(int j=0; j<temp.length(); j++){
				if(temp.charAt(j)=='h'){
					count++;
				}
			}
	
		}System.out.println("Occurence of h letter : " +count);
	}
}	
	