package navjeetK;

public class PatternPrinting6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i=1;i<=4;i++)
        {
            if (i%2!=0)
            {
                for(int j=1;j<=4;j++)
                {
                    if (j%2!=0)
                    {
                        System.out.print("#" + " ");
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
                        System.out.print("#" + " ");
                    }

                    //System.out.println(" ");
                }

                System.out.println(" ");
            }
        }

        System.out.println(" ");



	}

}
