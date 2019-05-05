package nikitaG;

public class AreaPerimeter {

	float pi = 3.14f;

	double areaRectangle(double length, double width) {
		return length * width;
	}

	float areaCircle(float radius) {
		return pi * radius * radius;
	}

	double perimeterRectangle(double length, double width) {
		return 2 * (length + width);
	}

	float perimeterCircle(float radius) {
		return 2 * pi * radius;
	}

	public static void main(String[] args) {
		AreaPerimeter q4 = new AreaPerimeter();
		System.out.println("Area of rectangle is " + q4.areaRectangle(10, 20));
		System.out.println("Perimeter of rectangle is " + q4.perimeterRectangle(10, 20));
		System.out.println("Area of circle is " + q4.areaCircle(6));
		System.out.println("Perimeter of circle is " + q4.perimeterCircle(6));
	}
}
