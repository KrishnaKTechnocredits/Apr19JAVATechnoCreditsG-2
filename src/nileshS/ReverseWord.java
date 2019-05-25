package nileshS;
import java.util.Scanner;

class ReverseWord
{
	public static void main(String [] args)
	{
		String word;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Word: ");
		word = sc.nextLine();
		//System.out.println(word);
		for(int i=word.length()-1; i>=0; i--)
		{
			System.out.print(word.charAt(i));
		}
		System.out.println(" ");
	}
}
		
