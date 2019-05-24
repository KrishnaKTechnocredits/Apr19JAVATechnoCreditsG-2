package rohiniB;
import java.util.Scanner;
public class charOcuurance {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Enter String : ");
		String input = sc.nextLine();
		
		System.out.println("Enter char to know its occurance :");
		char c = sc.next().charAt(0);
		
		int cnt = 0;
		for(int i=0;i<input.length();i++){
			char ch = input.charAt(i);
			
			if(ch==c)
				cnt++;
		}
				System.out.println("count is "+cnt);
				
				sc.close();
	}

}
