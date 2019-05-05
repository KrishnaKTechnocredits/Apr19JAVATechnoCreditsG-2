package kartikeyD;

public class AreaPerimeter {
	static void rectAreaPeri(int x, int y) {
		System.out.println("Area of a rectangle " + (x * y));
		System.out.println("Perimeter of a rectangle " + ((2) * (x + y)));
	}

	static void cirAreaPeri(int x) {
		System.out.println("Area of a circle " + ((3.14) * (x * x)));
		System.out.println("Perimeter of a crcle " + ((2) * (3.14) * (x)));
	}

	
	
	
	public static void main(String[] args) {
		rectAreaPeri(10, 23);
		cirAreaPeri(5);
//New comment
	}

}
