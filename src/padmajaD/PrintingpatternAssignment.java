package Assignment2;

public class PrintingpatternAssignment {

	static void m1() {

		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				if (i % 2 == 0)
					System.out.print("# " + "");
				else
					System.out.print("* " + "");
			}
			System.out.println();
		}
	}
	static void m3() {

		for (int i = 1; i <= 4; i++) {
			for (int j = 4; j >= i; j--) {
				
				System.out.print(j  + " ");
				
			}
			System.out.println();
		}
	}
	
	static void m4(){
		
			
			for (int i=1;i<=4;i++)
	        {
	            if (i%2!=0)
	            {
	                for(int j=1;j<=4;j++)
	                {
	                    if (j%2!=0)
	                    {
	                        System.out.print(j + " ");
	                    }
	                    else
	                    {
	                        System.out.print("*" + " ");
	                    }
	                }

	                System.out.println(" ");
	            }

	            else

	            {
	                for(int k=1;k<=4;k++)
	                {
	                    if (k%2!=0)
	                    {
	                        System.out.print("*" + " ");
	                    }
	                    else
	                    {
	                        System.out.print(k + " ");
	                    }

	                    //System.out.println(" ");
	                }

	                System.out.println(" ");
	            }
	        }

	        System.out.println(" ");


		}

	

	

	static void m6()
	{
		int num=0;
		for(int i=1;i<=3;i++)
		{
			for (int j=1;j<=3;j++)
			{
				num=num+3;
				
				System.out.print(num + " ");
			}
			
			System.out.println(" ");
		}

	}
	public static void main(String[] args) {
		//m1();
		//m3();
		m4();
		//m6();

	}

	
}