/* Java Basic Program
 	Q5
 */
package snehaN;

public class SimpleInterest {
	
	void interest(double principle,int time,double rate)
	{
		double si=(principle*time*rate)/100;
		System.out.println("Simple interest is : "+si);
	}

	public static void main(String args[])
	{
		SimpleInterest si=new SimpleInterest();
		si.interest(1125.90, 2, 6.5);
	}
}
