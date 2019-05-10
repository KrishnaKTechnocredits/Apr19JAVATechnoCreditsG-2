package nikitaG;

public class ReversePyramidNumbers {

	static void display(int num){
		for(int i = 1; i<= num;i++){
			for(int j= num;j>=i;j--){
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		display(4);
	}
}
