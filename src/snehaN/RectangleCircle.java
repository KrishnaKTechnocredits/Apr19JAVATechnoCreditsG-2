/* Java Basic Program
 	Q4
 */
package snehaN;

public class RectangleCircle {
	void Rectangle(int length,int width)
	{
		int rArea=length*width;
		int rPerimeter=2*(length+width);
		System.out.println("Area of rectangle is "+rArea);
		System.out.println("Perimeter of rectangle is "+rPerimeter);
	}
	
	void Circle(double radius)
	{
		double cArea=(22/7)*radius*radius;
		double cPerimeter=2*(22/7)*radius;
		System.out.println("Area of circle is "+cArea);
		System.out.println("Perimeter of circle is "+cPerimeter);
	}
	
	public static void main(String args[])
	{
		RectangleCircle rc1=new RectangleCircle();
		rc1.Rectangle(7, 9);
		rc1.Circle(49.07);
	}


}
