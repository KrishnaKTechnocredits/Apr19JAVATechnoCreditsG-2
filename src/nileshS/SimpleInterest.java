package nileshS;

public class SimpleInterest {
	
	void calInterest(double amount, int year, double rate)
	{
		double si;
		si = (amount*year*rate)/100;
		System.out.println("Interest is: "+si);
	}
	
	public static void main(String[] args) {
		SimpleInterest simpleInterest = new SimpleInterest();
		simpleInterest.calInterest(5000.00,5,13.2);		
	}

}
