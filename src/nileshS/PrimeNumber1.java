package nileshS;

public class PrimeNumber1 {

	boolean findPrime(int num, int range)
	{
		for(int j=num; j<=range ; j++)
		{
			boolean flag = true;
			for(int i=2; i<j; i++)
			{
				if(j % i == 0)
				{
					flag = false;
					System.out.println(j +" is not prime");
					break;
				}
				
			}
			
			if(flag == true)
				System.out.println(j +" is prime number");
		}
		return false;
	}
	public static void main(String[] args) {
		PrimeNumber1 primeNumber1 = new PrimeNumber1();
		primeNumber1.findPrime(1,10);
	}
}
