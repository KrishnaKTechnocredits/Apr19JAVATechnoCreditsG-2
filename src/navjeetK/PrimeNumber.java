package navjeetK;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int counter1=0;
		
		  for(int num=1;num<=50;num++)
		  {
		
			int counter=0;
			
			//int counter1=0;
			
			for (int j=2;j<=num-1;j++)
			{			
				if (num%j==0)
				{
					counter=counter+1;
				}									
			}
			
			if(counter==0)
			    {
				
				System.out.println(num + " : is Prime");
				
				counter1=counter1+1;
				}
			else{
			System.out.println(num + " : is not Prime");
			}
			
			// System.out.println("Total Number of Prime Number " + counter1 );
			}
		  
		 System.out.println("Total Number of Prime Number " + counter1);
		 
		}
}


