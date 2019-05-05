package nikitaG;

public class TemperatureUnitConv {

	float fahrenheitToCelsius(float fahrenheit) {
		return (fahrenheit - 32) * 5 / 9;
	}

	public static void main(String[] args) {
		System.out.println(new TemperatureUnitConv().fahrenheitToCelsius(100f));
	}
}
