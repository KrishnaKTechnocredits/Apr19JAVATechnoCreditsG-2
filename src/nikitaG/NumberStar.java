package nikitaG;

public class NumberStar {

	static void display(int num){
		for(int i =1;i <= num;i++){
			for(int j =1;j <= num;j++){
				if((i%2!=0 && j%2!=0) || (i%2==0 && j%2==0))
					System.out.print(j+" ");
				else 
					System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		display(15);
	}
}
