package rohiniB;
import java.util.Scanner;

public class reverseInteger {
	
	static void reverseNumber(int[] a){
		
		int[] b = new int[a.length];
		int num = a.length;
		
		for(int i = 0; i<a.length; i++){
			b[num-1] = a[i];
			num = num -1;
		}
		
		System.out.println("Reverse array is .....");
		for(int j = 0; j<b.length; j++){
			System.out.print(b[j]+" ");
		}
	}
	
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array....");
		int size = sc.nextInt();
		System.out.println("Enter array number....");
		int[] a = new int[size];
		
		for(int i=0; i<size; i++){
			a[i] = sc.nextInt();
		}
		
		reverseNumber(a);
		sc.close();
	}

}
