package rohiniB;

public class Pattern_assing5 {
	void Pattern(int i, int a){
		
		for(int j=1; j<=i; j++){
			for (int k=1; k<=j; k++){
				System.out.print(k + " ");
			}
			System.out.println(" ");
		}
		
		for(int j=a; j>=1; j--){
			for (int k=1; k<j; k++){
				System.out.print(k + " ");
			}
			System.out.println(" ");
		}
	}

	public static void main(String[] argu){
		Pattern_assing5  p5 = new Pattern_assing5();
		p5.Pattern(3, 3);
		
	}
	
	
}
