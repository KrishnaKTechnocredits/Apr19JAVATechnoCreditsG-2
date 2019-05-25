package nileshS;

public class MathCalculations {
	
	void addition(int a, int b)
	{
		System.out.println("Addition is:" +(a+b));
		
	}
	void substraction(int a, int b)
	{
		System.out.println("Substraction is:" +(a-b));
	}
	void multiplication(int a, int b)
	{
		System.out.println("Multiplication is:" +(a*b));
	}
	void division(int a, int b)
	{
		System.out.println("Division is:" +(a/b));
	}
	void remainder(int a, int b)
	{
		System.out.println("Remainder is:" +(a%b));
	}
	
	public static void main(String[] args) {
		MathCalculations mathCalculations = new MathCalculations();
		mathCalculations.addition(10,20);
		mathCalculations.substraction(50,20);
		mathCalculations.multiplication(10,70);
		mathCalculations.division(100,20);
		mathCalculations.remainder(5,3);
		
		
	}
	
}
