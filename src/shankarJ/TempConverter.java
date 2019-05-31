package shankarJ;
public class TempConverter {
	
	//Write a Java program to convert temperature from Fahrenheit to Celsius degree.

	public static void main(String[] args) {

		for (double i = 40; i >= 30; i = i - 10) {
			double t = 130;
			double c = fahrenheitToCelsius(0);

			System.out.println(i + "  " + (t + i) + "  " + (c + i));
		}
	}

	public static double fahrenheitToCelsius(double fahrenheit) {
		return ((fahrenheit - 32) * 5 / 9);

	}
}
