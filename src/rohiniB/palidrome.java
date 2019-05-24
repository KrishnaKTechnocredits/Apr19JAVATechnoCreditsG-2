package rohiniB;
import java.util.Scanner;

public class palidrome {
	
	static void pal(String original){
		String reverse ="";
		int len = original.length();
		
		for(int i=len-1; i>=0; i--){
			
			reverse = reverse + original.charAt(i);
		}
		
		if(original.equals(reverse))
			System.out.println("The String/integer is palidrome");
		else 
			System.out.println("The String/integer is not palidrome");
		}
	
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter String/integer to be check for palidrome :");
	String original = sc.nextLine();
		
	pal(original);
	
	sc.close();
	}

}
