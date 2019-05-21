package rohiniB;

public class Pattern_assing1 {
	
	static void m1(){
		
		for (int i=1; i<=4; i++){
				for (int j=1; j<=i; j++)
				{
				if(i%2 == 0)
				  System.out.print("# ");
				else 
				  System.out.print("* ");
				}
				
				System.out.println("");

		}
		
}
	
	public static void main(String[] argu){
		m1();
	}

}

