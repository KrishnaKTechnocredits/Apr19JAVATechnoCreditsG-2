package padmajaD;

public class areaandperimeter {
	static double pi = 3.14;
	static void area(int l, int b, int r)
	{
		int areaR = l * b;
		double areaC = pi * r * r;
		System.out.println("Area of Rectangle is :" + areaR);
		System.out.println("Area of circle is :" + areaC);
	}

	static void perimeter(int d, int l, int b)
	{
		double circumference = pi * d;
		int perimeter = 2*(l + b);
		System.out.println("Circumference of circle  is :" + circumference);
		System.out.println("Perimeter of Rectangle is :" + perimeter);
		
	}

public static void main(String[] args) {
	
	areaandperimeter.area(2,3,6);
	areaandperimeter.perimeter(2, 2, 2);
	
}
}