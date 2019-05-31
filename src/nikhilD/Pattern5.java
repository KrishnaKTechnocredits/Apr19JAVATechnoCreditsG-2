package nikhilD;

public class Pattern5 {
	public static void main(String[] args) {
		

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

                    
                }

                System.out.println(" ");
            }
        }

        System.out.println(" ");


	}

}


