package snehaN;

public class Pattern6 {
	
	static int count=0;
	void patternPrinting(int rows)
	{
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=rows;j++)
			{
				count=count+3;
				System.out.print(count+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		
		Pattern6 p6=new Pattern6();
		p6.patternPrinting(3);
	}
}
