package rohiniB;

public class Patteren_assing3 {
	
	void patteren(int i){
		
		for (int j=4; j>=1; j--){
			int l = 4;
			for (int k=j; k>=1; k--){
			System.out.print(l+" ");
			l--;
			}
			System.out.println(" ");
		}
			
		
	}
	
	public static void main(String[] argu){
		Patteren_assing3 p1 = new Patteren_assing3();
		p1.patteren(4);
	}

}
