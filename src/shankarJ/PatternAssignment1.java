package shankarJ;

public class PatternAssignment1 {

	public static void main(String[] args) {

		for (int a = 1; a <= 4; a++) 
		{
			for (int b = 1; b <= a; b++) 
			{
				if (a % 2 == 0) 
				{
					System.out.print("# ");
				}

				else

				{
					System.out.print("* ");
				}
			}
			System.out.println();
		}

	}
}
