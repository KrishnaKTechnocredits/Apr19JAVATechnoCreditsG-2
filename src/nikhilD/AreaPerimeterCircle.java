package nikhilD;

public class AreaPerimeterCircle {
	public static void main(String[] args) {
		double radius = 7.5f;
		double perimeter = 0;
		double area = 0;
		
		perimeter = 2 * Math.PI * radius;// calculating Perimeter of circle using math function PI
		area = Math.PI * radius * radius;
		System.out.println("Perimeter is = " + perimeter);
		System.out.println("Area is = " + area);
		}
}
