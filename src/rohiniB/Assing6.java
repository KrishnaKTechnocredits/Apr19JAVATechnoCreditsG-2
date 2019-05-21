package rohiniB;

public class Assing6 {
	// calculate conversion form Fahrenheit to Celsius 
	void conversionFtoC(double far){
		double cal;
		cal = (far - 32) * 5/9;
		System.out.println("Conversion from Fahrenheit to Celsius : "+ cal);
	}
	
	public static void main(String[] argu){
		Assing6 f1 = new Assing6();
		f1.conversionFtoC(23.6);
	}
}
