/* Java Basic Program
 	Q6
 */
package snehaN;

public class Temperature {
	
	void convertToCelcius(double fahrenheitTemp)
	{
		double celcius=(fahrenheitTemp-32)*5/9;
		System.out.println("Conversion of "+fahrenheitTemp+" fahrenheit temperature into celcius degree temperature is "+celcius);
	}
	
	public static void main(String args[])
	{
		new Temperature().convertToCelcius(45.50);
	}

}
