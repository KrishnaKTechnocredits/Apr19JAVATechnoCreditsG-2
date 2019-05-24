/* Java Basic Program
 	Q10
 */
package snehaN;

public class Prime {
	 int primeCnt=0;
	 int notPrimeCnt=0;
	 int sum=0;
	void isPrime(int number)
	{
		int temp=0;
		for(int i=2;i<number;i++)
		{
			if(number%i==0)
			{
				temp=1;
				System.out.println(number+" not prime");
				notPrimeCnt++;
				break;
			}
		}
		if(temp==0)
		{
			System.out.println(number+" is prime");
			primeCnt++;
			sum=sum+number;
		}
	}
	
	void primeNumberFromRange(int startN,int endN)
	{
		for(int start=startN;start<=endN;start++)
	   	{
	   		isPrime(start);
	   	}
		System.out.println("count of prime numbers is "+primeCnt);
		System.out.println("count of not prime numbers is "+notPrimeCnt);
		System.out.println("sum of prime numbers is "+sum);
	}
	
	void getAvg()
	{
		double avg=(double)sum/primeCnt;
		System.out.println("avg of prime numbers is "+avg);
	}
	
	public static void main(String args[])
	{
   	Prime primeNum=new Prime();
   	primeNum.primeNumberFromRange(2, 100);
	primeNum.getAvg();
	}
}




