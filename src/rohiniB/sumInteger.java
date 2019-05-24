package rohiniB;
import java.util.Scanner;
public class sumInteger {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number - ");
		int num = sc.nextInt();
		int q, sum=0;
				
		while(num>0){
			q = num%10;
		    num = num/10;
			sum = sum + q;	
		}
		
		System.out.println("Sum of all digits : "+ sum);
		sc.close();
	}

}
