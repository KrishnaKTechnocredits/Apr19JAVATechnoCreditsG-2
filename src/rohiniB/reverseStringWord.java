package rohiniB;

import java.util.Scanner;

public class reverseStringWord {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		
		String  line = sc.nextLine();
		
		String[] input = line.split(" ");
		String[] reverseW = new String[input.length];
		int temp = 0;
		
		for(int i = input.length-1; i>=0; i--){
			reverseW[temp] = input[i];
			temp = temp+1;
			
		}
		
		for(int i=0; i<reverseW.length; i++){
			String str = reverseW[i];
			System.out.print(" ");
			for (int j = str.length()-1; j>=0; j--)
				System.out.print(str.charAt(j));
			}
		
		sc.close();
		}

}
