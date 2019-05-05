package punamK;

class Question10{
	int count=0;
	int sum=0;
	
		public static void main(String[] args){
		Question10 question10=new Question10();
		//question10.primeCheck(23);
		question10.range(10, 20);
		}
		void primeCheck(int num){
		int i;	
		int temp=0;
		for (i=2;i<num;i++)
		{
			if(num%i==0){
				temp=1;
				System.out.println(num +"Not prime");
				break;
						}
		}
		if(temp==0){
			System.out.println(i+" Number is Prime");
			count++;
			sum=sum+ i;
		}
		
		}
		void range(int start, int end){
			for (int x=start; x<=end;x++){
				primeCheck(x);
			}
			System.out.println("Total Prime Nos are " +count);
			System.out.println("Sum of Prime" + sum);
			System.out.println("Avg of Nos is " + (sum/count));
		}
}




