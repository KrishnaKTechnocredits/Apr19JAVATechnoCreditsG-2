package padmajaD;

public class SimpleInterest {

	static float calculation(float p, float t, float r) {
		float simpleI = (p * t * r) / 100;
		System.out.println("Simle Interest is :" + simpleI);
		return simpleI;

	}

	public static void main(String[] args) {
		// SimpleInterest c = new SimpleInterest();
		// System.out.println(c.simpleI(12.3,15.3,16.3));

		SimpleInterest.calculation(10, 5, 5);

	}
}