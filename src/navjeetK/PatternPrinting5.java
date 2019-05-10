package navjeetK;

public class PatternPrinting5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j + " ");
			}
			
			System.out.println(" ");
		}
		
		//System.out.println(" ");
		
		for(int i=2;i>=1;i--)
		{
		
		for(int k=1;k<=i;k++)
		{
			System.out.print(k + " ");
		}
		
		System.out.println(" ");
	}


	}
	
}


