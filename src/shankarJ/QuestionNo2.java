package shankarJ;

public class QuestionNo2 {
	
	// Find duplicate number on Integer array in Java?
	
	public static void main(String[] args) 
	{
		int[] d_num = { 1, 2, 3, 5, 7, 6, 3, 8 };

		for (int i = 0; i < d_num.length - 1; i++) 
		{
			for (int j = i + 1; j < d_num.length; j++) 
			{
				if ((d_num[i] == d_num[j]) && (i != j)) 
				{
					System.out.println("Duplicate Number : " + d_num[j]);
				}
			}
		}
	}
}
