package rohiniB;
import java.util.Scanner;
public class reverseString {
	
	public static void main(String[] args){
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter String");
	
	String  line = sc.nextLine();
	
	String[] input = line.split(" ");
			
	for(int i=0; i<input.length; i++){
		String str = input[i];
		System.out.print(" ");
		for (int j = str.length()-1; j>=0; j--)
			System.out.print(str.charAt(j));
		}
	
	sc.close();
	}

}
