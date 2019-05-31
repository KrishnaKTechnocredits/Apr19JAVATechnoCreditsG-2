package nikhilD;

public class CalculatorParameter {

	public void sum(int a, int b)
		{
			int addition = a+b;
			System.out.println("Addition of 2 no.is" +  (addition));
		}
		
		public void sub(int a, int b)
		{
			int substraction = a-b;
			System.out.println("Substraction of 2 no.is" + (substraction));
		}
		
		public void div(int a, int b)
		{
			int division = a/b;
			System.out.println("Division of 2 no.is" + (division));
		}
		
		public void mul(int a, int b)
		{
			int multiplication = a*b;
			System.out.println("Multiplication of 2 no.is" + (multiplication));
		}
		
		public void remainder(int a, int b)
		{
			int remainder = a%b;
			System.out.println("Remainder of 2 no.is" + (remainder));
		}
		
		
	
		public static void main(String a[])
		{
			CalculatorParameter calp = new CalculatorParameter();
			calp.sum(20,30);
			calp.sub(70,20);
			calp.div(100,2);
			calp.mul(10,5);
			calp.remainder(100,6);
		}
	
	

}
