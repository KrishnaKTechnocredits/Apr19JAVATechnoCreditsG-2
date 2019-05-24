package rohiniB;

public class Pattern_assing2 {

	void pattern(int i){
		
		for (int j=1; j<=i; j++){
			
			if((j%2) == 0 )
			{
			for (int k=1; k<=i; k++){
				if ((k%2)==0)
				System.out.print(" # ");
				else
					System.out.print(" * ");
			}
			
			System.out.println(" ");
		}
			
			if((j%2)!=0){
				{
					for (int k=1; k<=i; k++){
						if ((k%2)==0)
						System.out.print(" * ");
						else
							System.out.print(" # ");
					}
					
					System.out.println(" ");
				}

			}
				
		}
	}
	
	public static void main(String[] argu){
		
		Pattern_assing2 p2 = new Pattern_assing2();
		p2.pattern(4);
		
	}
}
