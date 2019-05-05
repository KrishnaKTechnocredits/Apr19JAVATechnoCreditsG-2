package nileshS;

//swapping two numbers without using third variable.

public class SwapNum2 {
	
	void swapnumber(int a, int b)
	{
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("Swapping is: "+a+ " " + b);
		
	}
	
	public static void main(String[] args) {
		SwapNum2 swapNum2 = new SwapNum2();
		swapNum2.swapnumber(20,22);
	}

}
