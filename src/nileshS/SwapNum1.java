package nileshS;

//swapping two numbers using third variable.

public class SwapNum1 {
	
	void swapnumber(int a, int b)
	{
		int temp;
		
		temp = a;
		a = b;
		b= temp;
		
		System.out.println("Swapping is: "+a+ " " + b);
		
	}
	
	public static void main(String[] args) {
		SwapNum1 swapNum1 = new SwapNum1();
		swapNum1.swapnumber(10,12);
	}

}
