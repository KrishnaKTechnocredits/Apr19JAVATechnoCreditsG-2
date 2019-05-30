package navjeetK;

public class LargestNumber {
	
	

	    void larget(int a,int b,int c)
	    {

	        if (a>b && a>c)
	        {
	            System.out.println("Largest of three numbers : " + a);
	        }
	        else if(b>a && b>c)
	        {
	            System.out.println("Largest of three numbers : " + b);
	        }
	        else
	        {
	            System.out.println("Largest of three numbers : " + c);
	        }

	    }

	    public static void main(String[] args)
	    {
	        LargestNumber l1=new LargestNumber();

	        l1.larget(10,20,25);
	    }
	}


