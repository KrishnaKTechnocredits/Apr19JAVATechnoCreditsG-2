package rohiniB;
import java.util.Scanner;
public class armStrong {
	
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number...");
		int num = sc.nextInt();
		
		int  q, sum=0;
		int temp;
		
		temp = num;
		
		while (num>0){
			q = num%10;
			//System.out.println(q);
		    num = num/10;
		    //System.out.println(num);
			sum = sum + (q*q*q);	
		
			}
		
		if(temp==sum)
		  System.out.println("armstrong number");
		else
			System.out.println("not a armstrong number");
			
		sc.close();
		
	}

}
