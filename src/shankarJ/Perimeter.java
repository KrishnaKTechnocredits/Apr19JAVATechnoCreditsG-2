package shankarJ;

public class Perimeter {
	//WAP to find the area and perimeter of Rectangle & Circle
	
	static int r, l, b;
	static double pi = 3.14, perimeter, area;

	void circle() {
		int r = 10;
		perimeter = 2 * pi * r;
		double area = pi * r * r;
		System.out.println("Circle perimeter is " + perimeter);
		System.out.println("Circle area is " + area);
	}

	void rectangle() {
		int b = 11;
		int l = 15;
		perimeter = 2 * (l + b);
		double area = l * b;
		System.out.println("Rectangle perimeter is " + perimeter);
		System.out.println("Rectangle area is " + area);
	}

	public static void main(String[] args) {
		Perimeter c = new Perimeter();
		c.circle();
		c.rectangle();

	}

}
