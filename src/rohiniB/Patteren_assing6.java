package rohiniB;

public class Patteren_assing6 {
	
	static void pattern(int n){
		int num = 3;
		int incr = 2;
		for (int i=1; i<=n; i++){
			for (int j=1; j<=n; j++){
				System.out.print(num +"  ");
				num = 3;
				num = num*incr;
				incr++;
			}
			System.out.println(" ");
		}
	}

	public static void main(String[] argu){
		pattern(3);
	}
}
